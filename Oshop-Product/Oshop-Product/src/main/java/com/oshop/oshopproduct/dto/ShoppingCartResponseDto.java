package com.oshop.oshopproduct.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class ShoppingCartResponseDto extends Status {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2895106985873480792L;
	
	List<ShoppingCartDto>  cartData;

}
