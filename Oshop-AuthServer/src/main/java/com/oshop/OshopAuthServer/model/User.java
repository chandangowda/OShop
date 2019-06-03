package com.oshop.OshopAuthServer.model;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Getter;
import lombok.Setter;

@Document(collection = "user")
@Setter @Getter
public class User {

	
	@Id
	private ObjectId id;
	
    @Indexed(unique = true, direction = IndexDirection.DESCENDING, dropDups = true)
    private String email;
    
    
    private String firstname;
    
    private String lastname;
    
    @JsonProperty(access = Access.WRITE_ONLY)
	private String password;

    
    private boolean enabled;
    
    @DBRef
    private List<Role> roles;
    
    
}
