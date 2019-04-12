package com.oshop.oshopproduct.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.oshop.oshopproduct.entity.Product;

@Repository
public interface ProductRepository  extends  MongoRepository<Product, ObjectId>{

}
