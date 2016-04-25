<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改房间信息</title>
</head>
<body>
	<%@include file="/info/adminInfo.jsp"%>

	<center>
		<h1>
			<font color="red">修改房间</font>

		</h1>
	</center>
	<s:form action="updateRoom">
		<table>
			<tr>
				<td><s:hidden name="room.roomid" value="%{room.roomid}"></s:hidden></td>
			</tr>
			<tr>
				<td><s:textfield name="room.name" value="%{room.name}"
						label="房间名称" readonly="true"></s:textfield></td>
			</tr>
			<tr>
				<td><s:textfield name="room.price" value="%{room.price}"
						label="房间价格"></s:textfield></td>
			</tr>
			<tr>
				<td><s:textfield name="room.category" value="%{room.category}"
						label="房间类型"></s:textfield></td>
			</tr>
			<tr>
				<td>
			<tr>
				<td class="tdLabel">房价状态</td>
				<s:if test="room.status==0">
					<td><select name="room.status">
							<option value="0" selected="selected">空闲</option>
							<option value="1">已入住</option>
					</select></td>
				</s:if>
				<s:else>
					<td><select name="room.status">
							<option value="0">空闲</option>
							<option value="1" selected="selected">已入住</option>
					</select></td>
				</s:else>
			</tr>
			</td>
			</tr>
		</table>
	</s:form>
</body>
</html>