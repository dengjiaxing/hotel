package com.integration.action.user;

import com.integration.entity.User;
import com.integration.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class UpdateUserAction extends ActionSupport {
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
		this.userService.updateUser(user);
		return SUCCESS;
	}
}
