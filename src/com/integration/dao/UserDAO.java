package com.integration.dao;

import java.util.List;

import com.integration.entity.User;

public interface UserDAO {
	public void saveUser(User user);
	public List<User> findAllUsers();
	public void deleteUser(User user);
	public void updateUser(User user);
	public User findUserById(int id);
	public User loginUser(User user);
}
