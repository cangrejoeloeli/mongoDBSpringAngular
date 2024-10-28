package com.db.msApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.db.msApp.services.PdfService;
import com.db.msApp.services.PdfSignerService;

import java.io.IOException;
import java.util.Locale;

@RestController
@RequestMapping("/api/pdf")
public class PdfController {

    @Autowired
    private PdfService pdfService;

    @Autowired
    private PdfSignerService pdfSignerService;

    @Autowired
    private MessageSource messageSource;

    @GetMapping("/download")
    public ResponseEntity<byte[]> downloadPdf() throws IOException {
        byte[] pdfBytes = pdfService.generatePdf();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_PDF);
        headers.setContentDispositionFormData("attachment", "archivo.pdf");

        return ResponseEntity.ok()
                .headers(headers)
                .body(pdfBytes);
    }

    @GetMapping("/paginas")
    public ResponseEntity<byte[]> downloadPaginasPdf() throws IOException {
        byte[] pdfBytes = pdfService.generarPaginas();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_PDF);
        headers.setContentDispositionFormData("attachment", "archivo.pdf");

        return ResponseEntity.ok()
                .headers(headers)
                .body(pdfBytes);
    }

    @GetMapping("/greet")
    public String greet(@RequestParam(name = "lang", required = false) String lang) {
        Locale locale;
        if (lang != null) {
            locale = new Locale.Builder().setLanguage(lang).build();
        } else
            locale = new Locale.Builder().setLanguage("es").setRegion("AR").build();

        return messageSource.getMessage("saludo", null, locale);
    }

    @GetMapping("/signed")
    public ResponseEntity<byte[]> getSigned() throws IOException {
        byte[] pdfBytes = pdfService.generatePdf();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_PDF);
        headers.setContentDispositionFormData("attachment", "archivo.pdf");

        pdfBytes = pdfSignerService.signPdf(pdfBytes);

        return ResponseEntity.ok()
                .headers(headers)
                .body(pdfBytes);
    }
}
