package com.gsj.clienteunico.repositories.mongoAfip;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.gsj.clienteunico.models.PersonaGSJ.Persona;

@Repository
public interface PersonasRepository extends MongoRepository<Persona, Long> {

}
