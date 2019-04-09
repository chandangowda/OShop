/**
 * 
 */
package com.oshop.oshopproduct.dto;


import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

/**
 * @author chandangowda
 *
 */
@Setter @Getter
public class Status implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8683977968038472149L;
	
	private int statusCode;
	
	private boolean status;
	
	private String statusMessage;

}
