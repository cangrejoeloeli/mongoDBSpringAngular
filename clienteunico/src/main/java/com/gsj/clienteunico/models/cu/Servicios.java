package com.gsj.clienteunico.models.cu;

import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Servicios {
    @Id
    private String id;

    @DBRef
    private ClienteUnico clienteUnico;

    @DBRef
    private TipoServicio tipoServicio;

    private Long numero;

    private Set<Email> emails;

    @Indexed(unique = true, name = "inx_cis")
    private Long cis;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ClienteUnico getClienteUnico() {
        return clienteUnico;
    }

    public void setClienteUnico(ClienteUnico clienteUnico) {
        this.clienteUnico = clienteUnico;
    }

    public TipoServicio getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(TipoServicio tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public Long getCis() {
        return cis;
    }

    public void setCis(Long cis) {
        this.cis = cis;
    }

    public Set<Email> getEmails() {
        return emails;
    }

    public void setEmails(Set<Email> emails) {
        this.emails = emails;
    }

}
