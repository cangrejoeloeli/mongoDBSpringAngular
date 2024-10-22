package com.gsj.clienteunico.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gsj.clienteunico.models.cu.TipoServicio;
import com.gsj.clienteunico.repositories.mongoGsj.TipoServicioRepository;

@RestController
@RequestMapping("/init")
public class InitController {

    @Autowired
    private TipoServicioRepository tipoServicioRepository;

    @GetMapping
    public ResponseEntity<?> init() {
        TipoServicio tp = new TipoServicio();
        tp.setCodigo(01);
        tp.setDescripcion("GAS");
        tipoServicioRepository.save(tp);

        tp.setId(null);
        tp.setCodigo(03);
        tp.setDescripcion("INTERNET");
        tipoServicioRepository.save(tp);

        tp.setId(null);
        tp.setCodigo(04);
        tp.setDescripcion("TELEFONIA");
        tipoServicioRepository.save(tp);

        return ResponseEntity.ok().body("Iniciado");
    }

}
