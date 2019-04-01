package com.user.userInformation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.userInformation.dto.UserDto;
import com.user.userInformation.dto.UserResponseDto;
import com.user.userInformation.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/saveuser")
	public UserResponseDto saveUser(@RequestBody UserDto userRequest) {
		
		UserResponseDto response=userService.saveUser(userRequest);
		return response;
		
	}
	

}
