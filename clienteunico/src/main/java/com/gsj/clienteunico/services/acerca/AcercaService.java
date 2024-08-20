package com.gsj.clienteunico.services.acerca;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.List;

@Service
public class AcercaService {

    private final JdbcTemplate jdbcData;

    AcercaService(@Qualifier("acercaJdbcTemplate") JdbcTemplate jdbc) {
        this.jdbcData = jdbc;
    }

    public List<Map<String, Object>> obtenerServicios(Long page, Long rows) {
        String sql = "SELECT * FROM clientes_servicios ORDER BY CLIENTE_ID OFFSET " + String.valueOf(page * rows)
                + " ROWS FETCH NEXT " + String.valueOf(rows) + " ROWS ONLY";

        return jdbcData.queryForList(sql);
    }

}
