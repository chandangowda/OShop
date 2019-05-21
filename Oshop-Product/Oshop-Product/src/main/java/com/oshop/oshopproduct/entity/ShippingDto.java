package com.oshop.oshopproduct.entity;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ShippingDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 642881694777776942L;

	private String addressLine1;

	private String addressLine2;

	private String city;

	private String name;

}
