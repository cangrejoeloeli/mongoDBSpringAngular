package com.gsj.clienteunico.controllers;

import java.rmi.RemoteException;

// import org.apache.tomcat.util.openssl.openssl_h_Compatibility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gsj.clienteunico.afipws.WebServiceAfip;
import com.gsj.clienteunico.afipws.controllers.CuitController;
import com.gsj.clienteunico.afipws.services.ValidadorCuit;
import com.gsj.clienteunico.afipws.wsdl.PersonaServiceA5Stub.PersonaReturn;
import com.gsj.clienteunico.afipws.wsdl.SRValidationExceptionException;
import com.gsj.clienteunico.models.Prueba;
import com.gsj.clienteunico.models.PersonaGSJ.DatosGenerales;
import com.gsj.clienteunico.models.PersonaGSJ.DatosMonotributo;
import com.gsj.clienteunico.models.PersonaGSJ.Persona;
import com.gsj.clienteunico.mongoAfip.AfipPruebaRespository;
import com.gsj.clienteunico.mongoAfip.PersonasRepository;
import com.gsj.clienteunico.mongoGsj.GsjPruebaRespository;
import com.gsj.clienteunico.textos.services.TextoService;

import java.util.Map;

@RestController
@RequestMapping("/api/save")
public class PruebaController {

    @Autowired
    private GsjPruebaRespository gsjPruebaRespository;

    @Autowired
    private AfipPruebaRespository afipPruebaRespository;

    @Autowired
    private PersonasRepository personasRepository;

    @Autowired
    private WebServiceAfip webServiceAfip;

    @Autowired
    private TextoService textoService;

    @GetMapping("/{texto1}/{texto2}")
    public String comparar(@PathVariable String texto1, @PathVariable String texto2) {
        return textoService.compararDenonimaciones(texto1, texto2);
    }

    @GetMapping("/met/{texto1}/{texto2}")
    public Map<String, String> varios(@PathVariable String texto1, @PathVariable String texto2) {
        return textoService.metodosVarios(texto1, texto2);
    }

    @GetMapping("/{cuit}")
    public String doE(@PathVariable String cuit) {

        // Prueba prueba = new Prueba();
        // prueba.setNombre("Santinelli GSJ");
        // prueba.setCuit(2025088642L);

        // gsjPruebaRespository.save(prueba);

        // prueba.setNombre("Santinelli Afip");
        // afipPruebaRespository.save(prueba);
        Long cuitLong = 0L;
        if (ValidadorCuit.isValidCuitCuil(cuit)) {
            // limpia texto del string y lo convierte a Long
            cuitLong = ValidadorCuit.cuitToLong(cuit);
        } else {
            // Si no es válido - fuera
            return "Cuit " + cuit + " no es válido en su formato";
        }

        Persona test = personasRepository.findById(cuitLong).orElse(null);
        if (test != null)
            return "La persona está en mongo db ";

        // Verifico formato de cuit

        PersonaReturn personaAfip;
        try {

            personaAfip = webServiceAfip.getCuitDataFromAfip(cuitLong).getGetPersona_v2Response()
                    .getPersonaReturn();
            Persona pers = new Persona(personaAfip, cuitLong);

            personasRepository.save(pers);
        } catch (RemoteException e) {
            Persona pers = new Persona(new PersonaReturn(), cuitLong);
            ObjectMapper o = new ObjectMapper();
            String value = e.getLocalizedMessage();
            try {
                value = o.writeValueAsString(e);
            } catch (Exception em) {

            }
            pers.setMensaje(value);
            personasRepository.save(pers);

        } catch (SRValidationExceptionException e) {

            e.printStackTrace();
        }

        return String.valueOf(cuit);

    }

}
