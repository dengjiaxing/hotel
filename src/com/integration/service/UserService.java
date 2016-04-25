package com.integration.service;

import java.util.List;

import com.integration.entity.User;

public interface UserService {
	public void saveUser(User user);
	public List<User> findAllUsers();
	public void deleteUser(User user);
	public void updateUser(User user);
	public User findUserById(int id);
	public User loginUser(User user);
}
