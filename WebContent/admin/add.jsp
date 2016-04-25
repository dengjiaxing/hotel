<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加管理员</title>
</head>
<body>
<%@ include file="/info/adminInfo.jsp" %>
<h1><font color="red">添加管理员</font></h1>
<s:form action="saveAction">
		<s:textfield name="admin.username" label="用户名"></s:textfield>
	<s:password name="admin.password" label="密码"></s:password>
	<s:submit value="添加"></s:submit>
	</s:form>
</body>
</html>