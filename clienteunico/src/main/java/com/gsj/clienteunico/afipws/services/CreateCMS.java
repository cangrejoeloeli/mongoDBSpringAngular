package com.gsj.clienteunico.afipws.services;

import java.io.FileReader;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Collections;

import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cert.jcajce.JcaCertStore;
import org.bouncycastle.cert.jcajce.JcaX509CertificateConverter;
import org.bouncycastle.cms.CMSProcessableByteArray;
import org.bouncycastle.cms.CMSSignedData;
import org.bouncycastle.cms.CMSSignedDataGenerator;
import org.bouncycastle.cms.CMSTypedData;
import org.bouncycastle.cms.jcajce.JcaSignerInfoGeneratorBuilder;
import org.bouncycastle.openssl.PEMKeyPair;
import org.bouncycastle.openssl.PEMParser;
import org.bouncycastle.openssl.jcajce.JcaPEMKeyConverter;
import org.bouncycastle.openssl.jcajce.JceOpenSSLPKCS8DecryptorProviderBuilder;
import org.bouncycastle.operator.ContentSigner;
import org.bouncycastle.operator.InputDecryptorProvider;
import org.bouncycastle.operator.jcajce.JcaContentSignerBuilder;
import org.bouncycastle.operator.jcajce.JcaDigestCalculatorProviderBuilder;
import org.bouncycastle.pkcs.PKCS8EncryptedPrivateKeyInfo;

public class CreateCMS {

    public static byte[] crearCms(String pKeyFile, String certFile, String service, String password) {
        try {

            /* obtengo el login ticket */
            final String loginTicketString = LoginTicket.crearLoginTicket(service);
            // System.out.println(loginTicketString);

            // Leer el archivo XML
            byte[] dataToSign = loginTicketString.getBytes();

            PrivateKey privateKey;
            // Cargar certificado y clave privada
            if (password == null) {
                privateKey = loadPrivateKey(pKeyFile);
            } else {
                privateKey = loadPrivateKey(pKeyFile, password);
            }

            X509Certificate certificate = loadCertificate(certFile);

            // Crear el firmador CMS
            CMSSignedDataGenerator generator = new CMSSignedDataGenerator();

            ContentSigner contentSigner = new JcaContentSignerBuilder("SHA1withRSA")
                    .build(privateKey);
            generator.addSignerInfoGenerator(new JcaSignerInfoGeneratorBuilder(
                    new JcaDigestCalculatorProviderBuilder().build())
                    .build(contentSigner, certificate));
            generator.addCertificates(new JcaCertStore(Collections.singletonList(certificate)));

            // Crear el CMS
            CMSTypedData cmsData = new CMSProcessableByteArray(dataToSign);
            CMSSignedData signedData = generator.generate(cmsData, true);

            return signedData.getEncoded();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new byte[0];
    }

    private static X509Certificate loadCertificate(String certPath) throws Exception {
        try (PEMParser pemParser = new PEMParser(new FileReader(certPath))) {
            X509CertificateHolder certHolder = (X509CertificateHolder) pemParser.readObject();
            return new JcaX509CertificateConverter().getCertificate(certHolder);
        }
    }

    private static PrivateKey loadPrivateKey(String keyPath) throws Exception {
        try (PEMParser pemParser = new PEMParser(new FileReader(keyPath))) {
            byte[] keyBytes = pemParser.readPemObject().getContent();
            PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(keyBytes);
            KeyFactory kf = KeyFactory.getInstance("RSA");

            return kf.generatePrivate(spec);
        }
    }

    public static PrivateKey loadPrivateKey(String keyPath, String password) throws Exception {
        Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());

        try (PEMParser pemParser = new PEMParser(new FileReader(keyPath))) {
            Object object = pemParser.readObject();

            // Verifica si es una clave privada en formato PKCS#8 cifrada
            if (object instanceof PKCS8EncryptedPrivateKeyInfo) {
                PKCS8EncryptedPrivateKeyInfo encryptedPrivateKeyInfo = (PKCS8EncryptedPrivateKeyInfo) object;

                JceOpenSSLPKCS8DecryptorProviderBuilder decryptorProviderBuilder = new JceOpenSSLPKCS8DecryptorProviderBuilder();
                InputDecryptorProvider decryptorProvider = decryptorProviderBuilder.build(password.toCharArray());

                // Desencripta la clave privada
                PrivateKeyInfo privateKeyInfo = encryptedPrivateKeyInfo.decryptPrivateKeyInfo(decryptorProvider);

                // Convierte PrivateKeyInfo a PrivateKey
                JcaPEMKeyConverter converter = new JcaPEMKeyConverter();
                return converter.getPrivateKey(privateKeyInfo);
            } else {
                // Manejar claves no cifradas (PEM o PKCS#8 sin cifrar)
                PEMKeyPair keyPair = (PEMKeyPair) object;
                return new JcaPEMKeyConverter().getPrivateKey(keyPair.getPrivateKeyInfo());
            }
        }
    }
}
