package com.db.msApp.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.db.msApp.models.PermisoNombre;

@RepositoryRestResource(collectionResourceRel = "permisos", path = "permisos")
public interface PermisosRespository extends MongoRepository<PermisoNombre, String> {

}
