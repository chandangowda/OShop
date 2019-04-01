package com.user.userInformation.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.user.userInformation.dto.UserDto;
import com.user.userInformation.dto.UserResponseDto;
import com.user.userInformation.entity.User;
import com.user.userInformation.repository.UserRepository;
import com.user.userInformation.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	Mapper mapper;
	
	
	public UserResponseDto saveUser(UserDto userRequest) {
		    UserResponseDto responseDto=new UserResponseDto();
			User newUser=mapper.map(userRequest, User.class);
			userRepository.save(newUser);
			responseDto.setStatus(true);
			responseDto.setStatusCode(200);
			responseDto.setStatusMessage("User Created");
			return responseDto;
		
			
		
	}
	
	public UserResponseDto getUser(UserDto userRequest) {
		UserResponseDto res=new UserResponseDto();
		List<UserDto> userList=new ArrayList<>();
		User user=userRepository.findByUserEmail(userRequest.getUserEmail());
		UserDto newUser=mapper.map(user, UserDto.class);
		userList.add(newUser);
		res.setUserList(userList);
		return null;
		
	}


}
