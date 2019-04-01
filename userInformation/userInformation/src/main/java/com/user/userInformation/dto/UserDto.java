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

	private String userName;
	
	private String userEmail;

	private String role;

}
