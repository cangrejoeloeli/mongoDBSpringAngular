package com.gsj.clienteunico.controllers;

import java.rmi.RemoteException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gsj.clienteunico.afipws.WebServiceAfip;
import com.gsj.clienteunico.afipws.services.ValidadorCuit;
import com.gsj.clienteunico.afipws.wsdl.PersonaServiceA5Stub.PersonaReturn;
import com.gsj.clienteunico.anotations.ValidEmailMX;
import com.gsj.clienteunico.afipws.wsdl.SRValidationExceptionException;
import com.gsj.clienteunico.models.PersonaGSJ.Persona;
import com.gsj.clienteunico.models.cu.Email;
import com.gsj.clienteunico.repositories.mongoAfip.PersonasRepository;
import com.gsj.clienteunico.requests.Usuario;
import com.gsj.clienteunico.services.ClienteUnicoService;
import com.gsj.clienteunico.textos.services.TextoService;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;

@RestController
@RequestMapping("/api/save")
public class PruebaController {

    // @Autowired
    // private GsjPruebaRespository gsjPruebaRespository;

    // @Autowired
    // private AfipPruebaRespository afipPruebaRespository;

    @Autowired
    private PersonasRepository personasRepository;

    @Autowired
    private WebServiceAfip webServiceAfip;

    @Autowired
    private TextoService textoService;

    @Autowired
    private ClienteUnicoService clienteUnicoService;

    @GetMapping("/addemail/{email}")
    public ResponseEntity<?> addEmail(@Valid @ValidEmailMX @PathVariable("email") String email) {

        Email rta = clienteUnicoService.email_add(email);

        return ResponseEntity.ok().body(rta);
    }

    @PostMapping("/usuarios")
    public ResponseEntity<?> registrarUsuario(@Valid @RequestBody Usuario usuario, BindingResult result) {
        if (result.hasErrors()) {
            return new ResponseEntity<>(result.getAllErrors().toString(), HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(usuario, HttpStatus.OK);
    }

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
