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

    public List<Map<String, Object>> obtenerItemsPorFactura(Integer factura_id) {
        String sql = "SELECT * FROM Facturas_items WHERE FACTURA_ID = "
                + String.valueOf(factura_id) + " ORDER BY PERIODO";

        return jdbcTemplate.queryForList(sql);
    }

    /*
     * SELECT * FROM facturas_s as fact
     * INNER JOIN Facturas_items as items
     * On items.FACTURA_ID = fact.FACTURA_ID
     * WHERE fact.CLIENTE_SERVICIO_ID = 24019
     * order by fact.PERIODO
     */

}
