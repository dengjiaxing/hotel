package com.integration.action.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.integration.entity.User;
import com.integration.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class SaveUserAction extends ActionSupport{
	private User user;
	private UserService userService;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		this.userService.saveUser(this.user);
		return SUCCESS;
	}
	public String register(){
		this.userService.saveUser(this.user);
		HttpServletRequest request=ServletActionContext.getRequest();
		HttpSession session=request.getSession();
		session.setAttribute("user", this.user);
		return "regSuc";
	}
}
