package com.gsj.clienteunico.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gsj.clienteunico.models.cu.Email;
import com.gsj.clienteunico.repositories.mongoGsj.EmailRespository;

@Service
public class ClienteUnicoService {

    @Autowired
    private EmailRespository emailRespository;

    /**
     * Para agregar correos.
     * Busca si existe, si no, lo agrega
     * 
     * @param email direción de correo a agregar
     * @return el objeto email completo, sea nuevo o el encontrado
     */
    public Email email_add(String email) {

        Email resp = emailRespository.findByEmail(email).orElse(null);
        if (resp != null)
            return resp;

        resp = new Email();
        resp.setEmail(email);
        // si es nuevo va a tener la fecha actual
        resp.setFh_update(new Date());

        resp = emailRespository.save(resp);

        return resp;
    }

}
