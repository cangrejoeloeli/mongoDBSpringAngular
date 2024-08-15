package com.gsj.clienteunico.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gsj.clienteunico.models.Prueba;
import com.gsj.clienteunico.mongoAfip.AfipPruebaRespository;
import com.gsj.clienteunico.mongoGsj.GsjPruebaRespository;

@RestController
@RequestMapping("/api/prueba")
public class PruebaController {

    @Autowired
    private GsjPruebaRespository gsjPruebaRespository;

    @Autowired
    private AfipPruebaRespository afipPruebaRespository;

    @GetMapping("")
    public String doE() {

        Prueba prueba = new Prueba();
        prueba.setNombre("Santinelli GSJ");
        prueba.setCuit(2025088642L);

        gsjPruebaRespository.save(prueba);

        prueba.setNombre("Santinelli Afip");
        afipPruebaRespository.save(prueba);

        return "Did it";

    }

}
