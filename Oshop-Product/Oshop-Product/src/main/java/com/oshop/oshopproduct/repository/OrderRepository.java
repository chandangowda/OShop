package com.oshop.oshopproduct.repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.oshop.oshopproduct.entity.Order;

@Repository
public interface OrderRepository extends MongoRepository<Order, ObjectId> {
	
	List<Order> findByuserId(String userID);

}
