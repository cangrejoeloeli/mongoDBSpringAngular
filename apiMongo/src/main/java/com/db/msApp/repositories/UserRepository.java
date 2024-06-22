package com.db.msApp.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.db.msApp.models.User;

public interface UserRepository extends MongoRepository<User, String> {

}
