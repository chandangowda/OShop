package com.user.userInformation.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class UserResponseDto  extends Status {

	/**
	 * 
	 */
	private static final long serialVersionUID = -496377281873144999L;
	
	private List<UserDto> userList;

}
