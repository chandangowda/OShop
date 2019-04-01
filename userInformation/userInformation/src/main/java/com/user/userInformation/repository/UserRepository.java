package com.user.userInformation.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.user.userInformation.entity.User;

public interface UserRepository extends MongoRepository<User, ObjectId> {
	
	User findByUserEmail(String email);

}
