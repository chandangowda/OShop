package com.oshop.oshopproduct.dto;

import java.io.Serializable;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class ShoppingCartDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7513098414562629781L;

	private String dateCreated;

	private String id;
	
	private List<ItemDto> items;


}
