package com.oshop.oshopproduct.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.oshop.oshopproduct.entity.Order;

public interface OrderRepository extends MongoRepository<Order, ObjectId> {

}
