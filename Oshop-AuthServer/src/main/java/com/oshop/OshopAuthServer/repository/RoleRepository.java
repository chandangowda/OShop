package com.oshop.OshopAuthServer.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.oshop.OshopAuthServer.model.Role;

public interface RoleRepository extends MongoRepository<Role, ObjectId> {
	
	
	Role findByRolename(String rolename);

}
