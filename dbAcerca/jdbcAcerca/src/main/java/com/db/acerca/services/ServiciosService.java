package com.db.acerca.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ServiciosService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Map<String, Object>> obtenerTodosLosServicios(Long page, Long rows) {
        String sql = "SELECT * FROM clientes_servicios ORDER BY CLIENTE_ID OFFSET " + String.valueOf(page * rows)
                + " ROWS FETCH NEXT " + String.valueOf(rows) + " ROWS ONLY";
        // SELECT * FROM TableName ORDER BY id OFFSET 10 ROWS FETCH NEXT 10 ROWS ONLY;
        return jdbcTemplate.queryForList(sql);
    }

    public Long obtenerCantidadDeServicios() {
        String sql = "SELECT COUNT(*) FROM clientes_servicios";
        return jdbcTemplate.queryForObject(sql, Long.class);
    }

}
