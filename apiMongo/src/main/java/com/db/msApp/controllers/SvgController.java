package com.db.msApp.controllers;

import org.apache.tomcat.util.digester.DocumentProperties.Charset;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/svg")
public class SvgController {

    @Autowired
    private ResourceLoader resourceLoader;

    @GetMapping(value = "/new")
    public ResponseEntity<String> getSvgImage() throws IOException {

        Resource blanco = resourceLoader.getResource("classpath:static/svgs/blanco.svg");

        String svgBlanco = blanco.getContentAsString(StandardCharsets.UTF_8);

        // String svg = "<svg width=\"100\" height=\"100\"
        // xmlns=\"http://www.w3.org/2000/svg\">" +
        // "<circle cx=\"50\" cy=\"50\" r=\"40\" stroke=\"black\" stroke-width=\"3\"
        // fill=\"red\" />" +
        // "</svg>";
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "image/svg+xml");

        return new ResponseEntity<>(svgBlanco, headers, HttpStatus.OK);
    }

}
