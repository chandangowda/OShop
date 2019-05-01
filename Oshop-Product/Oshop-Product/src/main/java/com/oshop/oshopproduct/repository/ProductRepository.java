package com.oshop.oshopproduct.repository;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.oshop.oshopproduct.entity.Product;

@Repository
public interface ProductRepository  extends  MongoRepository<Product, ObjectId>{
	
	Optional<Product> findById(ObjectId productId);

}
