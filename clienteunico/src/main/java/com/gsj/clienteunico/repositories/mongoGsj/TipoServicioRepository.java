package com.gsj.clienteunico.repositories.mongoGsj;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gsj.clienteunico.models.cu.TipoServicio;

public interface TipoServicioRepository extends MongoRepository<TipoServicio, String> {

}
