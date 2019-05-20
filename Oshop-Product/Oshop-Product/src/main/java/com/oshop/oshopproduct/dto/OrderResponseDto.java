package com.oshop.oshopproduct.dto;

import java.io.Serializable;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class OrderResponseDto extends Status implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7494350041692455138L;
	
	private List<OrderDto> orderData;
	
	

}
