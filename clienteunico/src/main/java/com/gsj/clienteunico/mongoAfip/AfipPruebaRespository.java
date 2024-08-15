package com.gsj.clienteunico.mongoAfip;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.gsj.clienteunico.models.Prueba;

public interface AfipPruebaRespository extends MongoRepository<Prueba, ObjectId> {

}
