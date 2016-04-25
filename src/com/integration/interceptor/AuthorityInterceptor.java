package com.integration.interceptor;

import java.util.Map;

import org.aopalliance.intercept.Invocation;

import com.integration.entity.User;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class AuthorityInterceptor extends AbstractInterceptor{

	@Override
	//µÇÂ¼À¹½ØÆ÷
	public String intercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		ActionContext context=invocation.getInvocationContext();
		Map session=context.getSession();
		User user=(User) session.get("user");
		if (user!=null) {
			return invocation.invoke();
		}
		context.put("message", "Äú»¹Ã»ÓÐµÇÂ¼£¬ÇëµÇÂ¼ÏµÍ³¡£");
		return Action.LOGIN;
	}

}
