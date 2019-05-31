package com.user.userInformation.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.user.userInformation.entity.Role;


@Repository
public interface RoleRepository extends MongoRepository<Role, ObjectId> {

}
