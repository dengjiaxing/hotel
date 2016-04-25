<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理员管理首页</title>
</head>
<body>
		<s:a href="/hotel/authorityAdmin/listUser.action">客户管理</s:a>
		&nbsp;
		<s:a href="/hotel/authorityAdmin/listRoom.action">房间管理</s:a>
		&nbsp;
		<s:a href="/hotel/authorityAdmin/listOrder.action">订单管理</s:a>
		&nbsp;
		<s:a href="/hotel/authorityAdmin/adminService!loginOut">退出</s:a>
</body>
</html>