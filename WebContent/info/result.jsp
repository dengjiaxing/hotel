<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>房间预定成功</title>
	</head>
	<body>
		<%@include file="/info/userInfo.jsp"%>
		<br />
		<br />
		<br />
		提示：
		<red>
		<s:property value="message" />
		</red>
	</body>
</html>
