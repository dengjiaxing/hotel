package com.integration.action.admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.integration.entity.Admin;
import com.integration.service.AdminService;
import com.opensymphony.xwork2.ActionSupport;
import com.sun.corba.se.spi.orbutil.fsm.Input;

public class AdminServiceAction extends ActionSupport {
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
		return super.execute();
	}

	public String login() {
		Admin adminLogin=this.adminService.loginAdmin(admin);
		if(adminLogin!=null){
			HttpServletRequest request=ServletActionContext.getRequest();
			HttpSession session=request.getSession();
			session.setAttribute("admin", adminLogin);
			return "loginSuc";
		}
		return INPUT;
	}
	public String loginOut(){
		HttpServletRequest request=ServletActionContext.getRequest();
		HttpSession session=request.getSession();
		session.removeAttribute("admin");
		return INPUT;
	}
}
