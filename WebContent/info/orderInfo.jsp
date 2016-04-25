<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>用户所预定房间列表</title>
<script type="text/javascript">
	function del() {
		if (confirm("你确定要退订该房间吗?")) {
			return true;
		}
		return false;
	}
</script>
</head>
<body>
	<%@include file="/info/userInfo.jsp"%>
	<h1>
		<font color="red"><center>所预定的房间列表</center> </font>
	</h1>
	<table border="1" width="80%" align="center">
		<tr>
			<td>房间序号</td>
			<td>房间名称</td>
			<td>房间价格</td>
			<td>房间型号</td>
			<td>
					房间状态
				</td> 
			<td>操作</td>
		</tr>
		<s:iterator value="#request.listUserRoom" id="room">
			<tr>
				<td><s:property value="#room.roomid" /></td>
				<td><s:property value="#room.name" /></td>
				<td><s:property value="#room.price" /></td>
				<td><s:property value="#room.category" /></td>
				 <td>
						<s:if test="#room.status == 0">空房</s:if>
						<s:else>有客人</s:else>
					</td> 
				<td><s:a
						href="/hotel/orderService!delete?room.roomid=%{#room.roomid}"
						onclick="return del();">退订</s:a></td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>
