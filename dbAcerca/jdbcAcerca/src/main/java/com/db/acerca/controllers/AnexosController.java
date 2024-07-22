package com.db.acerca.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.db.acerca.services.AnexosService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/anexos")
public class AnexosController {

    @Autowired
    private AnexosService anexosService;

    @GetMapping("/calles")
    public List<Map<String, Object>> obtenerTodasLasCalles() {
        return anexosService.obtenerTodasLasCalles();
    }

    @GetMapping("/items")
    public List<Map<String, Object>> obtenerTodosLosItemss() {
        return anexosService.obtenerTodosLosItems();
    }

}
