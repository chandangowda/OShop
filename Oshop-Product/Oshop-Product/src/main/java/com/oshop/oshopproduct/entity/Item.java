package com.oshop.oshopproduct.entity;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class Item implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4595795116711566276L;
	
	private String productId;
	
	private int cartCount;

}
