package com.db.acerca.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.db.acerca.services.ServiciosService;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/api/servicios")
public class ServiciosController {

    @Autowired
    private ServiciosService serviciosService;

    @GetMapping("/todos")
    public List<Map<String, Object>> getAll(@RequestParam Optional<Long> page, @RequestParam Optional<Long> rows) {
        return serviciosService.obtenerTodosLosServicios(page.orElse(0L), rows.orElse(20L));
    }

    @GetMapping("/cantidad")
    public Long getCantidad() {
        return serviciosService.obtenerCantidadDeServicios();
    }

    /**
     * Listado de servicios por cliente id
     * 
     * @param clienteid
     * @return
     */
    @GetMapping("/byclienteid")
    public List<Map<String, Object>> getByClienteId(@RequestParam Long clienteid) {
        return serviciosService.serviciosByIdCliente(clienteid);
    }

    /**
     * servicios por servicio id
     * 
     * @param servicioId
     * @return
     */
    @GetMapping("/byservicioid")
    public Map<String, Object> getBySercicioId(@RequestParam Long servicioid) {
        return serviciosService.servicioByServicioId(servicioid);
    }

}
