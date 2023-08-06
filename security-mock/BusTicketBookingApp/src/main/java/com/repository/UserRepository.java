package com.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.model.Login;

public interface UserRepository extends MongoRepository<Login, String>{

	Optional<Login> findByUsername(String username);
}
