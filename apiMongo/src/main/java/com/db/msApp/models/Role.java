package com.db.msApp.models;

import java.util.HashSet;
import java.util.Set;

import org.springframework.data.annotation.Id;

public class Role {
    @Id
    private String id;
    private String name;
    private Set<ModulosPermisosAsignados> modulosAsignados = new HashSet<>();

    public Set<ModulosPermisosAsignados> getModulosAsignados() {
        return modulosAsignados;
    }

    public void setModulosAsignados(Set<ModulosPermisosAsignados> modulosPermitidos) {
        this.modulosAsignados = modulosPermitidos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
