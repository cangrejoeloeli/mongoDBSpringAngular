package com.db.msApp.services;

import java.io.FileInputStream;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.io.ByteArrayInputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.geom.Rectangle;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.StampingProperties;
import com.itextpdf.signatures.BouncyCastleDigest;
import com.itextpdf.signatures.DigestAlgorithms;
import com.itextpdf.signatures.IExternalDigest;
import com.itextpdf.signatures.IExternalSignature;
import com.itextpdf.signatures.PdfSignatureAppearance;
import com.itextpdf.signatures.PdfSigner;
import com.itextpdf.signatures.PrivateKeySignature;
import com.itextpdf.io.source.ByteArrayOutputStream;

@Service
public class PdfSignerService {

    @Autowired
    private ResourceLoader resourceLoader;

    final String keystorePath = "classpath:static/cert/desarrolloCert.p12";
    final String keystorePassword = "desarrollo";

    /**
     * Firma el pdf que ingresa en el parámetro.
     * 
     * @param pdfFile
     * @return
     */
    public byte[] signPdf(byte[] byteArrayPdf) {

        try {
            Resource blanco = resourceLoader.getResource(keystorePath);

            // Cargar el keystore
            KeyStore ks = KeyStore.getInstance("PKCS12");
            ks.load(blanco.getInputStream(), keystorePassword.toCharArray());
            String alias = ks.aliases().nextElement();

            // Obtener clave privada y certificado
            PrivateKey pk = (PrivateKey) ks.getKey(alias, keystorePassword.toCharArray());
            Certificate[] chain = ks.getCertificateChain(alias);

            // Genera bytesarrays para lectura y escritura
            // guardar en adobe el pdf descargado.
            ByteArrayOutputStream byteArrayOutput = new ByteArrayOutputStream();

            // creo el reader y writer para el pdf
            // PdfReader rd = new PdfReader(byteArrayInputStream);
            PdfReader rd = new PdfReader(new ByteArrayInputStream(byteArrayPdf));
            // PdfWriter wr = new PdfWriter(byteArrayOutput);

            // Leer el PDF y preparar para firmarlo

            // Crear el objeto de firma
            // PdfSigner signer = new PdfSigner(pdfDoc, wr.getOutputStream(), new
            // StampingProperties().useAppendMode());
            StampingProperties sp = new StampingProperties().useAppendMode();
            PdfSigner signer = new PdfSigner(rd, byteArrayOutput, sp);

            signer.setFieldName("DesarrolloFirma");

            float a4_width = PageSize.A4.getWidth();
            float a4_height = PageSize.A4.getHeight();

            Rectangle rect = new Rectangle(a4_width - 250, a4_height - 100, 200, 100); // Posición y tamaño de la firma
            signer.setReason("firma con desarrollo");
            signer.setLocation("AR - Junín");
            signer.setPageNumber(1);
            signer.setPageRect(rect);

            // Configurar el objeto de firma
            IExternalSignature pks = new PrivateKeySignature(pk, DigestAlgorithms.SHA256, "BC");
            IExternalDigest digest = new BouncyCastleDigest();

            // Firmar el documento
            signer.signDetached(digest, pks, chain, null, null, null, 0, PdfSigner.CryptoStandard.CADES);

            return byteArrayOutput.toByteArray();

        } catch (Exception e) {
            System.err.println(e.getLocalizedMessage());
            return byteArrayPdf;
        }

    }

}
