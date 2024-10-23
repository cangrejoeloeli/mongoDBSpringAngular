package com.gsj.clienteunico.requests;

import org.springframework.validation.annotation.Validated;

import com.gsj.clienteunico.anotations.ValidEmailMX;

import jakarta.validation.constraints.NotBlank;

@Validated
public class Usuario {

    @NotBlank(message = "No puede ser blanco")
    private String nombre;

    @ValidEmailMX(message = "El correo no tiene un dominio con registro MX válido")
    private String email;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
