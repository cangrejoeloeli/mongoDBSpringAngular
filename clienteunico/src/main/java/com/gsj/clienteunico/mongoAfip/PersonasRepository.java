package com.gsj.clienteunico.mongoAfip;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gsj.clienteunico.models.PersonaGSJ.Persona;

public interface PersonasRepository extends MongoRepository<Persona, Long> {

}
