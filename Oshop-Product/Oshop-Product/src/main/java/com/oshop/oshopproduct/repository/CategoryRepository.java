package com.oshop.oshopproduct.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.oshop.oshopproduct.entity.Category;

@Repository
public interface CategoryRepository extends MongoRepository<Category, String> {
	
	Optional<Category> findById(String name);

}
