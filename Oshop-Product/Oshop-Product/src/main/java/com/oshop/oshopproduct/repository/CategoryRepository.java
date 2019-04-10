package com.oshop.oshopproduct.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.oshop.oshopproduct.entity.Category;

public interface CategoryRepository extends MongoRepository<Category, String> {

}
