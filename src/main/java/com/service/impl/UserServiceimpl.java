package com.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.UserDao;
import com.entity.User;
import com.service.UserService;

@Service
public class UserServiceimpl implements UserService {

	@Resource
	private UserDao userDao;

	@Override
	public User checkUser(String name, String password) {
		return userDao.checkUser(name);
	}


	
}
