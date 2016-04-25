<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<title>房间列表</title>
		<script type="text/javascript">
function del() {
	if (confirm("确定删除房间信息吗?")) {
		return true;
	}
	return false;
}
</script>
	</head>
	<body>
		<%@include file="/info/adminInfo.jsp"%>
		<h1>
			<font color="red"><center>
					房间列表
				</center> </font>
		</h1>
		<s:a href="/hotel/room/add.jsp">增加房间</s:a>
		<table border="1" width="80%" align="center">
			<tr>
				<td>
					房间序号
				</td>
				<td>
					房间名称
				</td>
				<td>
					房间价格
				</td>
				<td> 
					房间类型 
				</td>
				<td>
					房间状态
				</td>
				<td>删除</td>
				<td>更新</td>
			</tr>
			<s:iterator value="#request.list" id="room">
				<tr>
					<td>
						<s:property value="#room.roomid" />
					</td>
					<td>
						<s:property value="#room.name" />
					</td>
					<td>
						<s:property value="#room.price" />
					</td>
					<td>
						<s:property value="#room.category" />
					</td>
					<td>
						<s:if test="#room.status == 0">空闲</s:if>
						<s:else>有客人</s:else>
					</td>
					<td>
						<s:a href="deleteRoom.action?room.roomid=%{#room.roomid}"
							onclick="return del();">delete</s:a>
					</td>
					<td>
						<s:a href="updatePRoom.action?room.roomid=%{#room.roomid}">update</s:a>
					</td>
				</tr>
			</s:iterator>
		</table>
	</body>
</html>