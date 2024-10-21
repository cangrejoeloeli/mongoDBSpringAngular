package com.gsj.clienteunico.repositories.mongoGsj;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gsj.clienteunico.models.cu.TipoAparicion;

public interface TipoAparicionRepository extends MongoRepository<TipoAparicion, String> {

}
