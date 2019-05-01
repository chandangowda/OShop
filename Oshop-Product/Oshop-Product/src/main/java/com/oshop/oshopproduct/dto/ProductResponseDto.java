package com.oshop.oshopproduct.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ProductResponseDto extends Status {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3393509210865115051L;
	
	private List<ProductDto> productResponseList;

}
