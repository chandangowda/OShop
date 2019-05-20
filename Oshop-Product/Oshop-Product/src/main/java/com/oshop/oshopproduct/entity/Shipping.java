package com.oshop.oshopproduct.entity;

import java.io.Serializable;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document(value="shipping")
@Getter @Setter
public class Shipping implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2320568065012030997L;

}
