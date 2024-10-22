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

    /**
     * Obtiene página de servicios
     * 
     * @param page
     * @param rows
     * @return
     */
    public List<Map<String, Object>> obtenerServiciosPage(Long page, Long rows) {
        String sql = "SELECT * FROM clientes_servicios ORDER BY CLIENTE_ID OFFSET " + String.valueOf(page * rows)
                + " ROWS FETCH NEXT " + String.valueOf(rows) + " ROWS ONLY";

        return jdbcData.queryForList(sql);
    }

    /**
     * Obtiene página de clientes de acerca
     * 
     * @param page
     * @param rows
     * @return
     */
    public List<Map<String, Object>> obtenerClientesPage(Long page, Long rows) {
        String sql = "SELECT * FROM clientes ORDER BY CLIENTE_ID OFFSET " + String.valueOf(page * rows)
                + " ROWS FETCH NEXT " + String.valueOf(rows) + " ROWS ONLY";

        return jdbcData.queryForList(sql);
    }

    /**
     * Obtiene página de clientes de acerca
     * reducido a campos de cliente unico
     * 
     * @param page
     * @param rows
     * @return
     */
    public List<Map<String, Object>> obtenerClientesPageReducido(Long page, Long rows) {
        String sql = "SELECT FISICA_JURIDICA, APELLIDO_NOMBRES_RAZON_SOCIAL, CLAVE, TIPO_DOC, NUMERO_DOC, DIGITO_VERIFICADOR, DOCUMENTO FROM clientes ORDER BY CLIENTE_ID OFFSET "
                + String.valueOf(page * rows)
                + " ROWS FETCH NEXT " + String.valueOf(rows) + " ROWS ONLY";

        return jdbcData.queryForList(sql);
    }

    /**
     * Obtiene página de clientes de acerca
     * reducido a campos de cliente unico
     * 
     * @param page
     * @param rows
     * @return
     */
    public List<Map<String, Object>> obtenerClientesReducido() {
        String sql = "SELECT FISICA_JURIDICA, APELLIDO_NOMBRES_RAZON_SOCIAL, CLAVE, TIPO_DOC, NUMERO_DOC, DIGITO_VERIFICADOR, DOCUMENTO FROM clientes ORDER BY CLIENTE_ID";
        return jdbcData.queryForList(sql);
    }
}
