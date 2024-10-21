package com.gsj.clienteunico.repositories.mongoGsj;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gsj.clienteunico.models.cu.Servicios;

public interface ServicioRepository extends MongoRepository<Servicios, String> {

}
