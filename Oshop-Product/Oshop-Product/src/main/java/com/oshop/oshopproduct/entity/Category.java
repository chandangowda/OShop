package com.oshop.oshopproduct.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.Setter;

@Document(collection="categories")
@Setter @Getter
public class Category implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5636879647804137564L;
	
	@Id
	private String id;
	
	@Field(value="name")
	private String name;
	

}
