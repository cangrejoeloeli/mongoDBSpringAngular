package com.gsj.clienteunico.models.cu;

import java.util.Set;
import java.util.HashSet;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@CompoundIndex(def = "{'tipo': 1, 'numero': 1, 'dv': 1}", name = "inx_doc", unique = true)
public class ClienteUnico {

    @Id
    private String id;

    private String tipoPersona;

    private String razonSocial;

    private String apellido;

    private String nombre;

    private String tipoDocumento;

    private Long docCompleto;

    private Integer prefijo;
    @Indexed(unique = true)
    private Long numero;
    private Integer dv;

    private boolean validado_afip;

    private boolean validado_renaper;

    @DBRef
    private Set<Email> emails = new HashSet<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(String tipoPersona) {
        this.tipoPersona = tipoPersona;
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

    public Integer getPrefijo() {
        return prefijo;
    }

    public void setPrefijo(Integer tipo) {
        this.prefijo = tipo;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public Integer getDv() {
        return dv;
    }

    public void setDv(Integer dv) {
        this.dv = dv;
    }

    public boolean isValidado_afip() {
        return validado_afip;
    }

    public void setValidado_afip(boolean validado_afip) {
        this.validado_afip = validado_afip;
    }

    public boolean isValidado_renaper() {
        return validado_renaper;
    }

    public void setValidado_renaper(boolean validado_renaper) {
        this.validado_renaper = validado_renaper;
    }

    public Set<Email> getEmails() {
        return emails;
    }

    public void setEmails(Set<Email> emails) {
        this.emails = emails;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public Long getDocCompleto() {
        return docCompleto;
    }

    public void setDocCompleto(Long docCompleto) {
        this.docCompleto = docCompleto;
    }

}
