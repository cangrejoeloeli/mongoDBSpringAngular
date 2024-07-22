package com.db.acerca.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.List;

/* datos de los clientes para extraer consultas */
@Service
public class ClientesService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * Obtiene los clientes paginados. Paǵina y cantidad
     * 
     * @param page
     * @param rows
     * @return
     */
    public List<Map<String, Object>> obtenerTodosLosClientes(Long page, Long rows) {
        String sql = "SELECT * FROM clientes ORDER BY CLIENTE_ID OFFSET " + String.valueOf(page * rows)
                + " ROWS FETCH NEXT " + String.valueOf(rows) + " ROWS ONLY";
        // SELECT * FROM TableName ORDER BY id OFFSET 10 ROWS FETCH NEXT 10 ROWS ONLY;
        return jdbcTemplate.queryForList(sql);
    }

    public Long obtenerCantidadDeClientes() {
        String sql = "SELECT COUNT(*) FROM clientes";
        return jdbcTemplate.queryForObject(sql, Long.class);
    }
}
