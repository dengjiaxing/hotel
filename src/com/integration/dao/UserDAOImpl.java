package com.integration.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.integration.entity.User;

public class UserDAOImpl extends HibernateDaoSupport implements UserDAO {
 

	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(user);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		String hsql="from User user order by user.userid asc";
		return this.getHibernateTemplate().find(hsql);
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(user);
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(user);
	}

	@Override
	public User findUserById(int id) {
		// TODO Auto-generated method stub
		
		return this.getHibernateTemplate().get(User.class, id);
	}

	@Override
	public User loginUser(User user) {
		// TODO Auto-generated method stub
		String hsql="from User user where user.username='"+user.getUsername()+"' and user.password='"+user.getPassword()+"'";
		@SuppressWarnings("unchecked")
		List<User> users=this.getHibernateTemplate().find(hsql);
		if (users.size()>0) {
			return users.get(0);
		}
		return null;
	}
}
