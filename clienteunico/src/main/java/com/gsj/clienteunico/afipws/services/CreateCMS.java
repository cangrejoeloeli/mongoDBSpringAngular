package com.gsj.clienteunico.afipws.services;

import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cert.jcajce.JcaCertStore;
import org.bouncycastle.cert.jcajce.JcaX509CertificateConverter;
import org.bouncycastle.cms.*;
import org.bouncycastle.cms.jcajce.JcaSignerInfoGeneratorBuilder;
import org.bouncycastle.openssl.PEMParser;
import org.bouncycastle.operator.ContentSigner;
import org.bouncycastle.operator.jcajce.JcaContentSignerBuilder;
import org.bouncycastle.operator.jcajce.JcaDigestCalculatorProviderBuilder;

import java.io.*;
import java.security.*;

import java.security.cert.X509Certificate;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Collections;

public class CreateCMS {

    public static byte[] crearCms(String pKeyFile, String certFile, String service) {
        try {

            /* obtengo el login ticket */
            final String loginTicketString = LoginTicket.crearLoginTicket(service);
            // System.out.println(loginTicketString);

            // Leer el archivo XML
            byte[] dataToSign = loginTicketString.getBytes();

            // Cargar certificado y clave privada
            PrivateKey privateKey = loadPrivateKey(pKeyFile);
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

}
