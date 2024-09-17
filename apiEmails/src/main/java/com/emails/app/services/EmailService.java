package com.emails.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import com.emails.app.models.MailRequest;

@Service
public class EmailService {

    @Value("${spring.mail.username}")
    private String fromMail;

    @Autowired
    private TemplateEngine templateEngine;

    @Autowired
    private JavaMailSender mailSender;

    public void sendSimpleEmail(String to, String subject, String text) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject(subject);
        message.setText(text);
        mailSender.send(message);
    }

    @Async
    public void sendMail(MailRequest request) throws MessagingException {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage);

        mimeMessageHelper.setFrom(fromMail);
        mimeMessageHelper.setTo(request.getToEmail());
        mimeMessageHelper.setSubject(request.getSubject());

        if (request.isHTML()) {
            Context context = new Context();
            /*
             * content is the variable defined in our HTML template within the div tag
             */
            context.setVariable("content", request.getMessage());
            String processedString = templateEngine.process("template", context);

            mimeMessageHelper.setText(processedString, true);
        } else {
            mimeMessageHelper.setText(request.getMessage(), false);
        }

        mailSender.send(mimeMessage);
    }
}
