package com.oshop.oshopproduct.service;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.oshop.oshopproduct.entity.ShoppingCart;

public interface ShoppingCartRepository extends MongoRepository<ShoppingCart, ObjectId> {

}
