package com.db.msApp.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.db.msApp.models.Libro;

@RepositoryRestResource(collectionResourceRel = "libros", path = "libros")
public interface LibrosRepository extends MongoRepository<Libro, String> {

}
