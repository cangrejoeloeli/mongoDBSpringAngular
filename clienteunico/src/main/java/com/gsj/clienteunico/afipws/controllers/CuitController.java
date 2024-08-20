package com.gsj.clienteunico.afipws.controllers;

import java.rmi.RemoteException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gsj.clienteunico.afipws.WebServiceAfip;
import com.gsj.clienteunico.afipws.wsdl.PersonaServiceA5Stub.PersonaReturn;
import com.gsj.clienteunico.afipws.wsdl.SRValidationExceptionException;

import com.gsj.clienteunico.afipws.services.ValidadorCuit;

@RestController
@RequestMapping("/api/cuit")
public class CuitController {

    @Autowired
    private WebServiceAfip webServiceAfip;

    @GetMapping("/{cuit}")
    public String getDataFromCuit(@PathVariable long cuit) {
        return String.valueOf(cuit);
    }

    @GetMapping("/valid/{cuit}")
    public String getValidCuit(@PathVariable String cuit) {
        return "Cuit:" + cuit + " es " + (ValidadorCuit.isValidCuitCuil(cuit) == true ? "válido" : "inválido");
    }

    @GetMapping("/fromAfip/{cuit}")
    public PersonaReturn getPersonaFromAfip(@PathVariable long cuit) {

        try {
            return webServiceAfip.verificaCuit(cuit).getGetPersona_v2Response().getPersonaReturn();

        } catch (RemoteException e) {

            e.printStackTrace();
        } catch (SRValidationExceptionException e) {

            e.printStackTrace();
        }
        return null;
    }
}
