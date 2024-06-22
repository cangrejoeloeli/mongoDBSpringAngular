package com.db.msApp.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.db.msApp.models.Role;

public interface RoleRepository extends MongoRepository<Role, String> {

}
