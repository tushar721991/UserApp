package com.softedge.userapp.repository.impl;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.softedge.userapp.entities.User;
import com.softedge.userapp.repository.UserRepository;

@Repository
public class UserRepositoryImpl implements UserRepository {

	private HashMap<String, User> data;

	public UserRepositoryImpl() {
		super();
		data = new HashMap<String, User>();
		data.put("john", new User("john", "john@123", "john@gmail.com"));
		data.put("alex", new User("alex", "alex@123", "alex@gmail.com"));
	}

	public User authenticate(User user) {

		User u = data.get(user.getUsername());
		if(u != null) {
			if(u.getPassword().equalsIgnoreCase(user.getPassword())) {
				return u;
			}
		}
		return null;
	}

	public boolean registerUser(User user) {
		data.put(user.getUsername(), user);
		return true;
	}

}
