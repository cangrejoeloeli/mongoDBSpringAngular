package com.gsj.clienteunico.models.cu;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Aparicion {

    @Id
    private String Id;

    @DBRef
    private ClienteUnico clienteUnico;

    private String tipoAparicion;

    private String razonSocial;
    private String apellido;
    private String nombre;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public ClienteUnico getClienteUnico() {
        return clienteUnico;
    }

    public void setClienteUnico(ClienteUnico clienteUnico) {
        this.clienteUnico = clienteUnico;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoAparicion() {
        return tipoAparicion;
    }

    public void setTipoAparicion(String tipoAparicion) {
        this.tipoAparicion = tipoAparicion;
    }

}
