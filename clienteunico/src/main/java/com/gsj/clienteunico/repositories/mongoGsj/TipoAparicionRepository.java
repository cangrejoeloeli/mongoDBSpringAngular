package com.gsj.clienteunico.repositories.mongoGsj;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.gsj.clienteunico.models.cu.TipoAparicion;

@Repository
public interface TipoAparicionRepository extends MongoRepository<TipoAparicion, String> {

}
