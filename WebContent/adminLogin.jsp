<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>管理员登录</title>
	</head>
	<body>
		<h1>
			<font color="red">管理员登录</font>
		</h1>
		<s:form action="adminService">
			<s:textfield name="admin.username" label="用户名"></s:textfield>
			<s:password name="admin.password" label="密码"></s:password>
			<s:submit method="login" value="登 录"></s:submit>
			<br />
			<s:a href="/hotel/login.jsp">用户登录</s:a>
			<br />
		</s:form>
	</body>
</html>
