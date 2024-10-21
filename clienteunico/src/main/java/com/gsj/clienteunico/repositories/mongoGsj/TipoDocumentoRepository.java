package com.gsj.clienteunico.repositories.mongoGsj;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gsj.clienteunico.models.cu.TipoDocumento;

public interface TipoDocumentoRepository extends MongoRepository<TipoDocumento, String> {

}
