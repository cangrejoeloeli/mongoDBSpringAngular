package com.gsj.clienteunico.repositories.mongoGsj;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.gsj.clienteunico.models.cu.Email;

public interface EmailRespository extends MongoRepository<Email, String> {

    /* para buscar por email */
    Optional<Email> findByEmail(String email);

}
