package com.gsj.clienteunico.models.cu;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.validation.annotation.Validated;

import com.gsj.clienteunico.anotations.ValidEmailMX;

@Validated
@Document
public class Email {

    @Id
    private String id;

    @Indexed(unique = true)
    @ValidEmailMX(message = "El correo no tiene un dominio con registro MX válido")
    private String email;

    private Date fh_update;

    private Date fh_validado;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFh_update() {
        return fh_update;
    }

    public void setFh_update(Date fh_update) {
        this.fh_update = fh_update;
    }

    public Date getFh_validado() {
        return fh_validado;
    }

    public void setFh_validado(Date fh_validado) {
        this.fh_validado = fh_validado;
    }

}
