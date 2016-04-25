package com.integration.service;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.integration.dao.AdminDAO;
import com.integration.entity.Admin;

public class AdminServiceImpl extends HibernateDaoSupport implements AdminService {
	private AdminDAO adminDao;
	
	public AdminDAO getAdminDao() {
		return adminDao;
	}

	public void setAdminDao(AdminDAO adminDao) {
		this.adminDao = adminDao;
	}

	@Override
	public void saveAdmin(Admin admin) {
		// TODO Auto-generated method stub
		adminDao.saveAdmin(admin);
	}

	@Override
	public List<Admin> findAllAdmin() {
		// TODO Auto-generated method stub
		return adminDao.findAllAdmin();
	}

	@Override
	public void removeAdmin(Admin admin) {
		// TODO Auto-generated method stub
		adminDao.removeAdmin(admin);
	}

	@Override
	public void updateAdmin(Admin admin) {
		// TODO Auto-generated method stub
		adminDao.updateAdmin(admin);
	}

	@Override
	public Admin findAdminById(int id) {
		// TODO Auto-generated method stub
		return adminDao.findAdminById(id);
	}

	@Override
	public Admin loginAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return adminDao.loginAdmin(admin);
	}

}
