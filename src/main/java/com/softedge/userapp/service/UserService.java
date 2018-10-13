package com.softedge.userapp.service;

import com.softedge.userapp.entities.User;

public interface UserService {

	public boolean authenticate(User user);

	public boolean registerUser(User user);

}
