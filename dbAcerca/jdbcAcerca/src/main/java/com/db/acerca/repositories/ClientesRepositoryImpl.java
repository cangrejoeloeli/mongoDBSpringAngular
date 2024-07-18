package com.db.acerca.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.db.acerca.models.Cliente;

@Repository
public class ClientesRepositoryImpl implements ClientesRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Cliente> findAll() {

        Long cantidad = jdbcTemplate.queryForObject("SELECT COUNT(*) FROM telefonia.dbo.clientes", Long.class);

        return jdbcTemplate.query("SELECT CLIENTE_ID, TIPO_DOC from clientes",
                BeanPropertyRowMapper.newInstance(Cliente.class));

    }

}
