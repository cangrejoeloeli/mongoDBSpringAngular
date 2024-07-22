package com.db.acerca.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.List;

@Service
public class ComercialService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Map<String, Object>> obtenerTodosLosPlanes() {
        String sql = "SELECT * FROM planes_telefonia_internet";
        return jdbcTemplate.queryForList(sql);
    }

    public List<Map<String, Object>> obtenerTodosLosPlanesComerciales() {
        String sql = "SELECT * FROM plan_comercial ORDER BY servicio, descripcion";
        return jdbcTemplate.queryForList(sql);
    }
}
