package com.oshop.oshopproduct.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class ItemDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7161062202983802393L;

	private String productId;

	private int cartCount;
	
	private double totalPrice;

}
