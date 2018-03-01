package com.mvc.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.mvc.domain.User;


public interface UserDao {
	
	public abstract User findByUserName(@Param("userName") String userName);

}
