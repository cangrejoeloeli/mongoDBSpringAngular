package com.gsj.clienteunico.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.gsj.clienteunico.services.acerca.AcercaService;
import com.gsj.clienteunico.services.gas.GasService;

@RestController
@RequestMapping("/listados")
public class ListadosController {

    @Autowired
    private GasService gasService;

    @Autowired
    private AcercaService acercaService;

    @GetMapping("/serviciosgas")
    public List<Map<String, Object>> getServiciosGas(@RequestParam Optional<Long> page,
            @RequestParam Optional<Long> rows) {
        return gasService.obtenerServicios(page.orElse(0L), rows.orElse(20L));
    }

    @GetMapping("/serviciosacerca")
    public List<Map<String, Object>> getServiciosAcerca(@RequestParam Optional<Long> page,
            @RequestParam Optional<Long> rows) {
        return acercaService.obtenerServicios(page.orElse(0L), rows.orElse(20L));
    }

    @GetMapping("/gas")
    public Map<String, String> getResumenGas() {
        return gasService.getDatosEstadistica();
    }
}
