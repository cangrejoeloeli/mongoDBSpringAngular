package com.gsj.clienteunico.repositories.mongoGsj;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.gsj.clienteunico.models.cu.ClienteUnico;

@Repository
public interface ClienteUnicoRepository extends MongoRepository<ClienteUnico, String> {
    Optional<ClienteUnico> findByNumero(Long numero);
}
