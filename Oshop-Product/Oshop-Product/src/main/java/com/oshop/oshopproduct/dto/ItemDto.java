package com.oshop.oshopproduct.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7732888151409699504L;

	private String productId;

	private int cartCount;

}
