package com.softedge.userapp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softedge.userapp.entities.User;
import com.softedge.userapp.repository.UserRepository;
import com.softedge.userapp.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	public boolean authenticate(User user) {
		if (userRepository.authenticate(user) != null) {
			return true;
		}
		return false;
	}

	public boolean registerUser(User user) {
		return userRepository.registerUser(user);
	}

}
