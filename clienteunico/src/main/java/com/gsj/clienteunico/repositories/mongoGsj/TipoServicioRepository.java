package com.gsj.clienteunico.repositories.mongoGsj;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.gsj.clienteunico.models.cu.TipoServicio;

@Repository
public interface TipoServicioRepository extends MongoRepository<TipoServicio, String> {

}
