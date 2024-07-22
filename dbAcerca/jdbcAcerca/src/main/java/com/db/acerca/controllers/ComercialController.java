package com.db.acerca.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.db.acerca.services.ComercialService;

import java.util.Map;
import java.util.List;

@RestController
@RequestMapping("/api/comercial")
public class ComercialController {

    @Autowired
    private ComercialService comercialServicio;

    @GetMapping("/planes")
    public List<Map<String, Object>> getTodosLosPlanes() {
        return comercialServicio.obtenerTodosLosPlanes();

    }

    @GetMapping("/planescomerciales")
    public List<Map<String, Object>> getTodosLosPlanesComerciales() {
        return comercialServicio.obtenerTodosLosPlanesComerciales();

    }

}
