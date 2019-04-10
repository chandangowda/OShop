package com.oshop.oshopproduct.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class CategoryDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 383371849819492863L;
	
	private String id;
	
	private String name;

}
