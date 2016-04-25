package com.integration.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.integration.entity.Admin;

public class AdminDAOImpl extends HibernateDaoSupport implements AdminDAO {
	@Override
	public void saveAdmin(Admin admin) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(admin);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Admin> findAllAdmin() {
		// TODO Auto-generated method stub
		String hql="from Admin admin order by admin.username asc";
		return this.getHibernateTemplate().find(hql);
	}

	@Override
	public void removeAdmin(Admin admin) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(admin);
	}

	@Override
	public void updateAdmin(Admin admin) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(admin);
	}

	@Override
	public Admin findAdminById(int id) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Admin.class, id);
	}

	@Override
	@SuppressWarnings("unchecked")
	public Admin loginAdmin(Admin admin) {
		// TODO Auto-generated method stub
		String hql="from Admin admin where admin.username='"+admin.getUsername()+"' and admin.password='"+admin.getPassword()+"'";
		
		List<Admin> admins=this.getHibernateTemplate().find(hql);
		if (admins.size()>0) {
			return admins.get(0);
		}
		return null;
	}
}
