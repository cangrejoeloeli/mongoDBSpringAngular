package com.gsj.clienteunico.controllers;

import java.util.Map;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gsj.clienteunico.afipws.services.ValidadorCuit;
import com.gsj.clienteunico.models.cu.ClienteUnico;
import com.gsj.clienteunico.models.cu.TipoServicio;
import com.gsj.clienteunico.repositories.mongoGsj.TipoServicioRepository;
import com.gsj.clienteunico.services.ClienteUnicoService;
import com.gsj.clienteunico.services.acerca.AcercaService;

@RestController
@RequestMapping("/clienteunico")
public class ClienteUnicoController {

    @Autowired
    private ClienteUnicoService clienteUnicoService;

    @Autowired
    private AcercaService acercaService;

    @Autowired
    private TipoServicioRepository tipoServicioRepository;

    @GetMapping("/acercaclientes")
    public ResponseEntity<?> procesarClientesAcerca() {

        TipoServicio tp = tipoServicioRepository.findByCodigo(03).orElse(null);

        // List<Map<String, Object>> lista =
        // acercaService.obtenerClientesPageReducido(100L, 5L);
        List<Map<String, Object>> lista = acercaService.obtenerClientesReducido();
        lista.forEach((obj) -> {

            String tipoPersona = obj.get("FISICA_JURIDICA").toString();
            String apynrs = obj.get("APELLIDO_NOMBRES_RAZON_SOCIAL").toString();
            String tipoDoc = obj.get("TIPO_DOC").toString();
            Integer clave = 0;
            try {
                clave = Integer.parseInt(obj.get("CLAVE").toString()); // calve de afip
            } catch (Exception e) {
                System.err.println(apynrs + " error en clave");
            }
            Long numero_doc = 0L;
            try {
                numero_doc = Long.parseLong(obj.get("NUMERO_DOC").toString()); // numero de afip o dni
            } catch (Exception e) {
                System.err.println(apynrs + " error en numero_doc");
            }
            Integer dv = 0;
            try {
                dv = Integer.parseInt(obj.get("DIGITO_VERIFICADOR").toString());
            } catch (Exception e) {
                System.err.println(apynrs + " error en dv");
            }

            Long documento = 0L;
            try {
                documento = ValidadorCuit.cuitToLong(obj.get("DOCUMENTO").toString()); // todo el numero
            } catch (Exception e) {
                System.err.println(apynrs + " error en documento");
            }

            ClienteUnico cl = new ClienteUnico();
            cl.setTipoDocumento(tipoDoc);
            cl.setPrefijo(clave);
            cl.setNumero(numero_doc);
            cl.setDv(dv);
            cl.setDocCompleto(documento);
            cl.setTipoPersona(tipoPersona);
            switch (tipoPersona) {
                case "F":
                    cl.setApellido(apynrs);
                    break;
                default:
                    cl.setRazonSocial(apynrs);
                    break;
            }

            clienteUnicoService.clienteUnico_add(cl, "ACERCA_CLIENTES");

            System.out.println(cl.getDocCompleto());
        }

        );
        return ResponseEntity.ok().body(lista);
    }

}
