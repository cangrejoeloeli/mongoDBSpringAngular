package com.db.acerca.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.influx.InfluxDbOkHttpClientBuilderProvider;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ServiciosService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * Listado de servicios paginado
     * 
     * @param page
     * @param rows
     * @return
     */
    public List<Map<String, Object>> obtenerTodosLosServicios(Long page, Long rows) {
        String sql = "SELECT * FROM clientes_servicios ORDER BY CLIENTE_ID OFFSET " + String.valueOf(page * rows)
                + " ROWS FETCH NEXT " + String.valueOf(rows) + " ROWS ONLY";
        // SELECT * FROM TableName ORDER BY id OFFSET 10 ROWS FETCH NEXT 10 ROWS ONLY;
        return jdbcTemplate.queryForList(sql);
    }

    /**
     * cantidad total de servicios
     * 
     * @return
     */
    public Long obtenerCantidadDeServicios() {
        String sql = "SELECT COUNT(*) FROM clientes_servicios";
        return jdbcTemplate.queryForObject(sql, Long.class);
    }

    /**
     * Servicios por cliente id
     * 
     * @param idCliente
     * @return
     */
    public List<Map<String, Object>> serviciosByIdCliente(Long idCliente) {

        String dir = "CONCAT(COALESCE(trim(nombre_calle),''),' - Nº ', COALESCE(NUMERO,''),' - Sec ' ,COALESCE(SECTOR,''),' - Bl ',COALESCE(BLOCK,'')  ,' - Tr ',COALESCE(torre,'')  ,' - P  ',COALESCE(piso,'')) AS DIRECCION, CONCAT(COALESCE(trim(calle_postal),''),            ' - Nº ', COALESCE(NUMERO_p,''),            ' - Sec ' ,COALESCE(SECTOR_p,''),            ' - Bl ',COALESCE(BLOCK_p,'')  ,            ' - Tr ',COALESCE(torre_p,'')  ,            ' - P  ',COALESCE(piso_p,'')          )        AS DIRECCION_POSTAL, calle_google";

        String sql = "SELECT *, " + dir + " FROM clientes_servicios WHERE ";
        sql += "CLIENTE_ID = " + idCliente;
        sql += " ORDER BY CLIENTE_SERVICIO_ID";
        // SELECT * FROM TableName ORDER BY id OFFSET 10 ROWS FETCH NEXT 10 ROWS ONLY;
        return jdbcTemplate.queryForList(sql);
    }
}
