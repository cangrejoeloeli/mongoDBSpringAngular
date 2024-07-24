package com.db.acerca.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.db.acerca.services.PlanesService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/api/planes")
public class PlanesController {

    @Autowired
    private PlanesService planesService;

    @GetMapping("/itemsFacturacion")
    public List<Map<String, Object>> getItemsFacturacion() {
        return planesService.getItemsFacturacion();
    }

    /**
     * Listado de planes comerciales
     * 
     * @return
     */
    @GetMapping("/planes")
    public List<Map<String, Object>> getPlanes() {
        return planesService.getPlanes();
    }
}
