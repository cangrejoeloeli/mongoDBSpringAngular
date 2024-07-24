package com.db.acerca.services;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacturasService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Map<String, Object>> obtenerFacturasPorServicio(Integer nroServicio) {

        String sql = "SELECT * FROM facturas_s WHERE CLIENTE_SERVICIO_ID = " + String.valueOf(nroServicio);
        return jdbcTemplate.queryForList(sql);
    }

}
