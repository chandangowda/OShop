package com.oshop.oshopproduct.entity;

import java.io.Serializable;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.Setter;

@Document(value="product")
@Getter @Setter
public class Product implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4293699080007159200L;

	@Id
	private ObjectId id;
	
	@Field(value="category")
	private String category;
	
	@Field(value="imageurl")
    private String imageUrl;
    
	@Field(value="price")
    private Double price;
    
	@Field(value="title")
    private String title;

}
