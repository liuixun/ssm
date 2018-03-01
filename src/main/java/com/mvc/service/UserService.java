package com.mvc.service;

import com.mvc.domain.User;

public interface UserService {
	
	public User findByUserName(String username);
}
