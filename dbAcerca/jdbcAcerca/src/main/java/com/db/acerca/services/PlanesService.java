package com.db.acerca.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class PlanesService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * Listado de planes comerciales
     * 
     * @return Lista de planes
     */
    public List<Map<String, Object>> getPlanes() {
        String sql = "SELECT * FROM plan_comercial ORDER BY descripcion";
        return jdbcTemplate.queryForList(sql);
    }

    /**
     * Listado de items de facturacion
     * 
     * @return
     */
    public List<Map<String, Object>> getItemsFacturacion() {
        String sql = "SELECT * FROM Items_facturacion ORDER BY TIPO_ITEM, DESCRIPCION";
        return jdbcTemplate.queryForList(sql);
    }

    public List<Map<String, Object>> getTiposItems() {
        String sql = "";
        return jdbcTemplate.queryForList(sql);
    }

}
