package com.db.msApp.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.db.msApp.models.Autor;

@RepositoryRestResource(collectionResourceRel = "autores", path = "autores")
public interface AutoresRepository extends MongoRepository<Autor, String> {

    Optional<Autor> findOneByName(String name);
}
