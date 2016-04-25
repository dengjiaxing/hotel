<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>用户登录</title>
	</head>
	<body>
		<h1>
			<font color="red">用户登录</font>
		</h1>
		<s:form action="userService">
			<s:textfield name="user.username" label="用户名"></s:textfield>
			<s:password name="user.password" label="密码"></s:password>
			<s:submit method="login" value="登 录"></s:submit>
			<br />
			<s:a href="/hotel/adminLogin.jsp">管理员登录</s:a>
			&nbsp;&nbsp;&nbsp;
			<s:a href="/hotel/register.jsp">新用户注册</s:a>
			<br />
			<br />
			<br />
		</s:form>
	</body>
</html>
