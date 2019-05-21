package com.oshop.oshopproduct.entity;

import java.io.Serializable;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Document(collection="order")
public class Order implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6019340723168543087L;
	
	@Id
	private ObjectId id; 
	
	private String datePlaced;
	
	private ShippingDto shipping;
	
	private List<Item> item;

}
