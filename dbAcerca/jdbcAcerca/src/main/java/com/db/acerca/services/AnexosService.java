package com.db.acerca.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.List;

@Service
public class AnexosService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Map<String, Object>> obtenerTodasLasCalles() {
        String sql = "SELECT * FROM calles";
        return jdbcTemplate.queryForList(sql);
    }

    public List<Map<String, Object>> obtenerTodosLosItems() {
        String sql = "SELECT * FROM items_planes_comerciales";
        return jdbcTemplate.queryForList(sql);
    }
}
