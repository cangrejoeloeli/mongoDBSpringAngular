package com.db.msApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.db.msApp.models.Modulo;
import com.db.msApp.models.Permiso;
import com.db.msApp.repositories.ModulosRepository;
import com.db.msApp.repositories.PermisosRespository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/seguridad")
public class PermisosController {

    @Autowired
    private ModulosRepository modulosRepository;

    @Autowired
    private PermisosRespository permisosRespository;

    @GetMapping("/modulos")
    public List<Modulo> getAllModulos() {
        return modulosRepository.findAll();
    }

    @GetMapping("/permisos")
    public List<Permiso> getAllPermisos() {
        return permisosRespository.findAll();
    }
}
