package com.gsj.clienteunico.services;

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
     * @param email
     * @return
     */
    public String email_add(String email) {

        Email resp = emailRespository.findByEmail(email).orElse(null);
        if (resp == null)
            return "Existe";

        resp = new Email();
        resp.setEmail(email);

        emailRespository.save(resp);

        return email + " Creado";
    }

}
