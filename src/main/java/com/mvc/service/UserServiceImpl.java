package com.mvc.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mvc.dao.UserDao;
import com.mvc.domain.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Resource  
	private UserDao userDao;

	public User findByUserName(String username) {
		System.out.println("userservice");
		User user = userDao.findByUserName(username);
		return user;
	}

}
