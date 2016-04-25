<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改密码</title>
</head>
<body>
		<h1>
			<font color="red">修改密码</font>
		</h1>
		<s:form action="userService">
			<table>
				<tr>
					<td>
						<s:hidden name="user.userid" value="%{user.userid}"></s:hidden>
					</td>
				</tr>
				<tr>
					<td>
						<s:textfield readonly="true" name="user.username"
							value="%{user.username}" label="用户名"></s:textfield>
					</td>
				</tr>
				<tr>
					<td>
						<!--<s:password name="user.password" value="%{user.password}" label="密码"></s:password>-->
						<s:textfield name="user.password" value="%{user.password}"
							label="密码"></s:textfield>
					</td>
				</tr>
				<tr>
					<td>
						<s:textfield name="user.mobile" value="%{user.mobile}"
							label="手机号码"></s:textfield>
					</td>
				</tr>
				<tr>
					<td>
						<s:textfield name="user.email" value="%{user.email}" label="邮箱地址"></s:textfield>
					</td>
				</tr>
				<tr>
					<td>
						<s:submit method="updateUser" value="修改"></s:submit>
					</td>
				</tr>
			</table>
		</s:form>
</body>
</html>