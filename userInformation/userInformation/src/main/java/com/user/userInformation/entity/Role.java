package com.user.userInformation.entity;

import java.io.Serializable;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;

public class Role implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 576846554302019134L;
	
	@Id
    private ObjectId id;
	
    @Indexed(unique = true, direction = IndexDirection.DESCENDING, dropDups = true)
    private String rolename;

}
