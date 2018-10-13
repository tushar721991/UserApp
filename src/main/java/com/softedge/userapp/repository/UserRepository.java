package com.softedge.userapp.repository;

import com.softedge.userapp.entities.User;

public interface UserRepository {

	public User authenticate(User user);

	public boolean registerUser(User user);
}
