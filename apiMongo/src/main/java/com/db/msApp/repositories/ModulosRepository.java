package com.db.msApp.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.db.msApp.models.ModuloNombre;

@RepositoryRestResource(collectionResourceRel = "modulos", path = "modulos")
public interface ModulosRepository extends MongoRepository<ModuloNombre, String> {

}
