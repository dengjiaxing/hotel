package com.integration.action.admin;

import com.integration.entity.Admin;
import com.integration.service.AdminService;
import com.opensymphony.xwork2.ActionSupport;

public class SaveAdminAction extends ActionSupport{
	private Admin admin;
	private AdminService adminService;
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	public AdminService getAdminService() {
		return adminService;
	}
	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		this.adminService.saveAdmin(admin);
		return SUCCESS;
	}
}
