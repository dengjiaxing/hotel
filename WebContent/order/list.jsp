<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户所预定房间列表</title>
<script type="text/javascript">
	function del() {
		if (confirm("确认删除吗?")) {
			return true;
		}
		return false;
	}
</script>
</head>
<body>
	<%@include file="/info/adminInfo.jsp"%>
	<h1><font color="red"><center>房间列表</center></font></h1>
	<table border="1" width="80%" align="center">
	<tr>
	<th>房间序号</th>
	<th>房间名称</th>
	<th>房间价格</th>
	<th>房间型号</th>
	<th>房间状态</th>
	</tr>
	<s:iterator value="#request.listAllRoom" id="room">
	<tr>
	<td><s:property value="#room.roomid"></s:property></td>
	<td><s:property value="#room.name"></s:property></td>
	<td><s:property value="#room.price"></s:property></td>
	<td><s:property value="#room.category"></s:property></td>
	<td><s:if test="#room.status==0">空房</s:if><s:else>有客人</s:else></td>
<%-- 	<td><s:a href="deleteRoom.action?room.roomid=%{#room.roomid}" onclick="return del();">delete</s:a></td>
	<td><s:a href="updateRoom.action?room.roomid=%{#room.roomid}" >update</s:a></td> --%>
	</tr>
	</s:iterator>
	</table>
</body>
</html>