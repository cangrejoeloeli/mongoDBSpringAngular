package com.db.acerca.controllers;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.db.acerca.models.Cliente;
import com.db.acerca.repositories.ClientesRepositoryImpl;

@RestController
@RequestMapping("/api/clientes")
public class ClientesController {

    @Autowired
    private ClientesRepositoryImpl clientesRepository;

    @GetMapping("")
    public List<Cliente> getMethodName() {
        final List<Cliente> lista = clientesRepository.findAll();
        return lista;
    }

}
