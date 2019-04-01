package com.user.userInformation.service;

import com.user.userInformation.dto.UserDto;
import com.user.userInformation.dto.UserResponseDto;

public interface UserService {

	UserResponseDto saveUser(UserDto userRequest);

}
