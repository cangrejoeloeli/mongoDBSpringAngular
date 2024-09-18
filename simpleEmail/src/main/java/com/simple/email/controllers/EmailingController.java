package com.simple.email.controllers;

import jakarta.mail.MessagingException;

import lombok.RequiredArgsConstructor;

import java.io.UnsupportedEncodingException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.simple.email.requests.MailRequest;
import com.simple.email.services.EmailingService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/mail")
public class EmailingController {
    private final EmailingService emailingService;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void sendMail(@RequestBody MailRequest request) throws MessagingException, UnsupportedEncodingException {
        emailingService.sendMail(request);
    }
}
