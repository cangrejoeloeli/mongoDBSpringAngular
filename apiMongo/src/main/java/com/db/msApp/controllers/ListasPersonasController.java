package com.db.msApp.controllers;

import java.io.InputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.db.msApp.models.Famoso;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/api/listas")
public class ListasPersonasController {

    @Autowired
    private ResourceLoader resourceLoader;

    @GetMapping("/todos")
    public ResponseEntity<?> compositores(@RequestParam("listado") String listado) {

        try {
            Resource famosos = resourceLoader.getResource("classpath:static/personas/" + listado + ".json");
            ObjectMapper objectMapper = new ObjectMapper();

            InputStream inputStream = famosos.getInputStream();
            List<Famoso> lista = objectMapper.readValue(inputStream, new TypeReference<List<Famoso>>() {
            });

            return ResponseEntity.ok().body(lista);
        } catch (Exception e) {
            return ResponseEntity.noContent().build();
        }

    }
}
