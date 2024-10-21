package com.gsj.clienteunico.models.cu;

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

}
