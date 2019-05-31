package com.oshop.OshopAuthServer.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.oshop.OshopAuthServer.model.User;

public interface UserRepository extends MongoRepository<User, ObjectId> {
	
	User findByEmail(String email);

}
