package com.emails.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.emails.app.services.EmailService;

@RestController
public class EmailController {
    @Autowired
    private EmailService emailService;

    @GetMapping("/sendEmail")
    public String sendEmail(@RequestParam String to, @RequestParam String subject, @RequestParam String text) {
        emailService.sendSimpleEmail(to, subject, text);
        return "Email sent successfully";
    }

    @GetMapping("/sendEmails")
    public String getMethodName() {

        String to = "msantinelli@grupojunin.com.ar";
        String subject;
        String text;
        for (int i = 1; i <= 20; i++) {
            text = "Cuerpo del correo " + i + " que va cambiando.";
            subject = "Email " + i;
            emailService.sendSimpleEmail(to, subject, text);
        }

        return "Enviados 200 emails.";
    }

}
