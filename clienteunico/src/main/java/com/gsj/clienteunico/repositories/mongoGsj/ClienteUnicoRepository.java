package com.gsj.clienteunico.repositories.mongoGsj;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gsj.clienteunico.models.cu.ClienteUnico;

public interface ClienteUnicoRepository extends MongoRepository<ClienteUnico, String> {

}
