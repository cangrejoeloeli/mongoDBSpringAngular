package com.db.acerca.controllers;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.db.acerca.models.Cliente;
import com.db.acerca.repositories.ClientesRepositoryImpl;
import com.db.acerca.services.ClientesService;

@RestController
@RequestMapping("/api/clientes")
public class ClientesController {

    @Autowired
    private ClientesRepositoryImpl clientesRepository;

    @GetMapping("/fields")
    public List<Cliente> getMethodName() {
        final List<Cliente> lista = clientesRepository.findAll();
        return lista;
    }

    @Autowired
    private ClientesService clientesService;

    /**
     * Obtiene los clientes paginados
     * http://localhost:8080/api/clientes/todos?page=4&rows=2
     * 
     * @param page pagina
     * @param rows cantidad de registros
     * @return Los clientes paginados
     */
    @GetMapping("/todos")
    public List<Map<String, Object>> getAll(@RequestParam Optional<Long> page, @RequestParam Optional<Long> rows) {
        return clientesService.obtenerTodosLosClientes(page.orElse(0L), rows.orElse(20L));
    }

    @GetMapping("/cantidad")
    public Long getCantidad() {
        return clientesService.obtenerCantidadDeClientes();
    }

}
