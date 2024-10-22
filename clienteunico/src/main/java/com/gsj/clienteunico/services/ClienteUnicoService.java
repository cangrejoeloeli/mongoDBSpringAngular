package com.gsj.clienteunico.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gsj.clienteunico.models.cu.Aparicion;
import com.gsj.clienteunico.models.cu.ClienteUnico;
import com.gsj.clienteunico.models.cu.Email;
import com.gsj.clienteunico.repositories.mongoGsj.AparicionRepository;
import com.gsj.clienteunico.repositories.mongoGsj.ClienteUnicoRepository;
import com.gsj.clienteunico.repositories.mongoGsj.EmailRespository;

@Service
public class ClienteUnicoService {

    @Autowired
    private EmailRespository emailRespository;

    @Autowired
    private ClienteUnicoRepository clienteUnicoRepository;

    @Autowired
    private AparicionRepository aparicionRepository;

    /**
     * Para agregar correos.
     * Busca si existe, si no, lo agrega
     * 
     * @param email direción de correo a agregar
     * @return el objeto email completo, sea nuevo o el encontrado
     */
    public Email email_add(String email) {

        Email resp = emailRespository.findByEmail(email).orElse(null);
        // Si es null lo crea
        if (resp == null) {
            resp = new Email();
            resp.setEmail(email);
            // si es nuevo va a tener la fecha actual
            resp.setFh_update(new Date());
            resp = emailRespository.save(resp);
        }
        return resp;
    }

    /**
     * Agrega un cliente
     * Si ya existe, carga una repetición
     * 
     * @param cu
     * @param ta
     * @return el cliente generado
     */
    public ClienteUnico clienteUnico_add(ClienteUnico cu, String ta) {

        ClienteUnico clienteUnico = clienteUnicoRepository.findByNumero(cu.getNumero()).orElse(null);
        // si es null lo crea con sus verificaciones
        if (clienteUnico == null) {
            clienteUnico = new ClienteUnico();
            clienteUnico = cu;
            clienteUnico = clienteUnicoRepository.save(clienteUnico);
        }

        // crea y guarda la apación
        Aparicion aparicion = new Aparicion();
        aparicion.setTipoAparicion(ta);
        aparicion.setClienteUnico(clienteUnico);
        aparicionRepository.save(aparicion);

        return clienteUnico;
    }
}
