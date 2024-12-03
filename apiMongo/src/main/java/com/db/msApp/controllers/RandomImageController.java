package com.db.msApp.controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageConfig;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.qrcode.QRCodeWriter;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Random;

@RestController
@RequestMapping("/api/img")
public class RandomImageController {

    private final Random random = new Random();

    @GetMapping("/string")
    public ResponseEntity<?> cadena() {
        return ResponseEntity.ok().body("Cadena");
    }

    @GetMapping("/randomimage")
    public ResponseEntity<byte[]> getRandomImage() {
        int width = 600;
        int height = 600;

        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = bufferedImage.createGraphics();

        // Fondo aleatorio
        g2d.setColor(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
        g2d.fillRect(0, 0, width, height);

        // Dibujar algunos rectángulos aleatorios
        for (int i = 0; i < 10; i++) {
            g2d.setColor(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
            g2d.fillRect(random.nextInt(width), random.nextInt(height), random.nextInt(50), random.nextInt(50));
        }

        g2d.dispose();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            ImageIO.write(bufferedImage, "png", baos);
        } catch (IOException e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "image/png");
        return new ResponseEntity<>(baos.toByteArray(), headers, HttpStatus.OK);
    }

    @GetMapping("/random-qr-code")
    public ResponseEntity<byte[]> getRandomQRCode() {
        String randomText = generateRandomText();
        BufferedImage qrImage = generateQRCodeImage(randomText);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            ImageIO.write(qrImage, "jpg", baos);
        } catch (IOException e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "image/jpeg");
        return new ResponseEntity<>(baos.toByteArray(), headers, HttpStatus.OK);
    }

    @GetMapping("/getqr/{texto}")
    public ResponseEntity<byte[]> getQr(@PathVariable("texto") String texto) {
        BufferedImage qrImage = generateQRCodeImage(texto);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            ImageIO.write(qrImage, "jpg", baos);
        } catch (IOException e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "image/jpeg");
        return new ResponseEntity<>(baos.toByteArray(), headers, HttpStatus.OK);
    }

    private String generateRandomText() {
        Random random = new Random();
        int length = 50;
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append((char) ('A' + random.nextInt(26)));
        }
        return sb.toString();
    }

    private BufferedImage generateQRCodeImage(String text) {
        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        int width = 250;
        int height = 250;
        try {
            var bitMatrix = qrCodeWriter.encode(text, BarcodeFormat.QR_CODE, width, height);
            return MatrixToImageWriter.toBufferedImage(bitMatrix, new MatrixToImageConfig(0xFF000000, 0xFFFFFFFF));
        } catch (WriterException e) {
            throw new RuntimeException("Error generating QR code", e);
        }
    }

    @GetMapping("/generateqr")
    public ResponseEntity<byte[]> generateQRCode(@RequestParam String url) {
        BufferedImage qrImage = generateQRCodeImage(url);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            ImageIO.write(qrImage, "jpg", baos);
        } catch (IOException e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "image/jpeg");
        return new ResponseEntity<>(baos.toByteArray(), headers, HttpStatus.OK);
    }
}
