package com.oshop.oshopproduct.dto;

import java.io.Serializable;
import java.util.List;

import lombok.Getter;
import lombok.Setter;


@Setter @Getter
public class CategoryResponseDto  extends Status implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5483643200739305225L;
	
	List<CategoryDto> categoryres;

}
