package com.integration.service;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.integration.dao.UserDAO;
import com.integration.entity.User;

public class UserServiceImpl extends HibernateDaoSupport implements UserService {
	private UserDAO userDao;
	
	public UserDAO getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDAO userDao) {
		this.userDao = userDao;
	}

	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		userDao.saveUser(user);
	}

	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return userDao.findAllUsers();
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		userDao.deleteUser(user);
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		userDao.deleteUser(user);
	}

	@Override
	public User findUserById(int id) {
		// TODO Auto-generated method stub
		return userDao.findUserById(id);
	}

	@Override
	public User loginUser(User user) {
		// TODO Auto-generated method stub
		return userDao.loginUser(user);
	}
}
