package com.db.msApp.models;

import java.util.HashSet;
import java.util.Set;

import org.springframework.data.mongodb.core.mapping.DBRef;

// Para usar en los datos dentro del obteto, no accede directamente a la clase.
public class ModulosAsignados {

    @DBRef
    private ModuloNombre modulo;

    @DBRef
    private Set<PermisoNombre> permisos = new HashSet<>();

    public ModuloNombre getModulo() {
        return modulo;
    }

    public void setModulo(ModuloNombre modulo) {
        this.modulo = modulo;
    }

    public Set<PermisoNombre> getPermisos() {
        return permisos;
    }

    public void setPermisos(Set<PermisoNombre> permisos) {
        this.permisos = permisos;
    }

}
