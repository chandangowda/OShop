package com.oshop.oshopproduct.dto;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class ProductExceptionDto extends Status{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3697591500356470964L;
	
	private String errorMessage;
	
	private String errorDetailMessage;
	
	

}
