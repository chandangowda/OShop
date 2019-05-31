package com.user.userInformation.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UserDto implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -5476655486674625129L;

	private String id;
	
    private String email;
    
    private String firstname;
    
    private String lastname;
    
	private String password;
    
    private boolean enabled;
    

}
