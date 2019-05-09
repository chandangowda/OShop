package com.oshop.oshopproduct.entity;

import java.io.Serializable;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;


@Document(value="shoppingcart")
@Getter @Setter
public class ShoppingCart implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4569745106948293412L;
	
	@Id
	private ObjectId id;
	
	private String dateCreated;

}
