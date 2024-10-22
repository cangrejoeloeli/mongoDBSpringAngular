package com.gsj.clienteunico.repositories.mongoGsj;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.gsj.clienteunico.models.cu.Email;

@Repository
public interface EmailRespository extends MongoRepository<Email, String> {

    /* para buscar por email */
    Optional<Email> findByEmail(String email);

}
