package com.db.acerca.controllers;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.db.acerca.services.FacturasService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/api/facturas")
public class FacturasController {

    @Autowired
    private FacturasService facturasService;

    /**
     * Facturas por número de servicio, no por CIS
     * 
     * @param nroServicio
     * @return
     */
    @GetMapping("/porservicio")
    public List<Map<String, Object>> getAll(@RequestParam Optional<Integer> nroServicio) {
        return facturasService.obtenerFacturasPorServicio(nroServicio.orElse(0));
    }

    @GetMapping("/porfacturaitems")
    public List<Map<String, Object>> getAllItems(@RequestParam Optional<Integer> factura_id) {
        return facturasService.obtenerItemsPorFactura(factura_id.orElse(0));
    }

}
