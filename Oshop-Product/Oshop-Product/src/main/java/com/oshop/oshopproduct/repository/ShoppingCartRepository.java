package com.oshop.oshopproduct.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;

import com.oshop.oshopproduct.entity.ShoppingCart;

public interface ShoppingCartRepository extends MongoRepository<ShoppingCart, ObjectId> {
	
	@Query("{'id':?0,'items.productId':?1}")
	ShoppingCart findByCartidAndProductId(String productId);


}
