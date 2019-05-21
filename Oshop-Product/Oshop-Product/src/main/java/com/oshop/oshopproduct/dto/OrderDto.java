package com.oshop.oshopproduct.dto;

import java.io.Serializable;
import java.util.List;

import com.oshop.oshopproduct.entity.Shipping;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class OrderDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5518435749786565929L;

	private String datePlaced;

	private Shipping shipping;
	
	private String id;

	private List<ItemDto> item;

}
