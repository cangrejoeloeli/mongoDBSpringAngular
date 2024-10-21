package com.gsj.clienteunico.services.acerca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.List;

@Service
public class AcercaService {

    @Autowired
    @Qualifier("acercaJdbcTemplate")
    private JdbcTemplate jdbcData;

    public List<Map<String, Object>> obtenerServiciosPage(Long page, Long rows) {
        String sql = "SELECT * FROM clientes_servicios ORDER BY CLIENTE_ID OFFSET " + String.valueOf(page * rows)
                + " ROWS FETCH NEXT " + String.valueOf(rows) + " ROWS ONLY";

        return jdbcData.queryForList(sql);
    }

}
