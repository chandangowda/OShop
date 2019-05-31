package com.oshop.OshopAuthServer.model;

import java.io.Serializable;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document(collection = "roles")
@Setter @Getter
public class Role implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6283609253992132988L;
	
	@Id
    private ObjectId id;
	
    @Indexed(unique = true, direction = IndexDirection.DESCENDING, dropDups = true)
    private String rolename;

}
