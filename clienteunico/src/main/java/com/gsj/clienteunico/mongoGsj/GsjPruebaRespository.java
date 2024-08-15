package com.gsj.clienteunico.mongoGsj;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.gsj.clienteunico.models.Prueba;

public interface GsjPruebaRespository extends MongoRepository<Prueba, ObjectId> {

}
