package com.db.msApp.models;

import java.util.HashSet;
import java.util.Set;

import org.springframework.data.mongodb.core.mapping.DBRef;

// Para usar en los datos dentro del obteto, no accede directamente a la clase.
public class ModulosPermisosAsignados {

    @DBRef
    private Modulo modulo;

    @DBRef
    private Set<Permiso> permisos = new HashSet<>();

    public Modulo getModulo() {
        return modulo;
    }

    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }

    public Set<Permiso> getPermisos() {
        return permisos;
    }

    public void setPermisos(Set<Permiso> permisos) {
        this.permisos = permisos;
    }

}
