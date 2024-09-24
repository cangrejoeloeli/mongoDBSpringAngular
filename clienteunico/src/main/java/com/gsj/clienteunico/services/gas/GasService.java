package com.gsj.clienteunico.services.gas;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class GasService {

    @Autowired
    @Qualifier("gasJdbcTemplate")
    private JdbcTemplate jdbcData;

    public List<Map<String, Object>> obtenerServicios(Long page, Long rows) {
        String sql = "SELECT Numero_pedido, CUENTA, Calle_inmueble, Numero_inmueble, Apellido_titular, Tipo_Doc_titular, num_doc_titular, Calle_titular, Numero_casa_titular, Locatario, Tipo_Doc_locatario, num_doc_locatario, Provincia_postal, codigo_postal_localidad, Localidad_postal, calle_postal, Numero_postal, tipo_suministro, Categoria, CUIT, calle_medidor, numero_casa_medidor, Usuario, codigo_calle, estado, TIPO_CLIENTE, partida, factura_electronica, aviso_electronico, email, Tipo_Doc_Usuario, num_doc_usuario, CUIL, titular_locatario, email_secundario, CIS"
                + " FROM clientes ORDER BY Numero_pedido OFFSET " + String.valueOf(page * rows)
                + " ROWS FETCH NEXT " + String.valueOf(rows) + " ROWS ONLY";

        return jdbcData.queryForList(sql);
    }

    /**
     * Para obtener datos de resumen de servicios de gas.
     * 
     * @return
     */
    public Map<String, String> getDatosEstadistica() {
        Map<String, String> datos = new HashMap<>();
        String sql;

        try {
            // Cantidad de servicios
            sql = "SELECT COUNT(*) FROM clientes";
            int cantidadServicios = jdbcData.queryForObject(sql, Integer.class);
            datos.put("Cantidad de servicios:", String.valueOf(cantidadServicios));

        } catch (Exception e) {
            datos.put("Error", e.getLocalizedMessage());
        }

        return datos;
    }
}
