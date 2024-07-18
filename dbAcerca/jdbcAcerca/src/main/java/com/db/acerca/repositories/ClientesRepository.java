package com.db.acerca.repositories;

import java.util.List;

import com.db.acerca.models.Cliente;

public interface ClientesRepository {
    List<Cliente> findAll();
}
