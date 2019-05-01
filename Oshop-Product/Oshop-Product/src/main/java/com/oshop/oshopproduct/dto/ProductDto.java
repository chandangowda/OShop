package com.oshop.oshopproduct.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter 
public class ProductDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6775172763900650685L;
	
	private String category;
	
    private String imageUrl;
    
    private Double price;
    
    private String title;
    
    private String id;

}
