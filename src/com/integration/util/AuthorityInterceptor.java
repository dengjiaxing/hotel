package com.integration.util;

import java.util.Map;

import org.aopalliance.intercept.Invocation;

import com.integration.entity.User;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.sun.corba.se.impl.interceptors.InterceptorInvoker;

public class AuthorityInterceptor extends AbstractInterceptor{

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		ActionContext context=invocation.getInvocationContext();
		Map session=context.getSession();
		User user=(User) session.get("user");
		if (user!=null) {
			return invocation.invoke();
		}
		context.put("message", "您还没有登录，请登录系统");;
		return Action.LOGIN;
	}

}
