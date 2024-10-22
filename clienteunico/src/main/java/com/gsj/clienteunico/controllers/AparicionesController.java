package com.gsj.clienteunico.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gsj.clienteunico.repositories.mongoGsj.AparicionRepository;

@RestController
@RequestMapping("/apariciones")
public class AparicionesController {

    @Autowired
    private AparicionRepository aparicionRepository;

    @GetMapping
    public ResponseEntity<?> listAparaciones() {
        return ResponseEntity.ok().body(aparicionRepository.findAll());
    }

}
