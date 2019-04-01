package com.user.userInformation.entity;

import java.io.Serializable;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document(collection="user")
@Setter @Getter
public class User implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8817120924020453069L;

	@Id
	private ObjectId id;

	private String userName;
	
	private String userEmail;

	private String role;
	
	
	
	
}
