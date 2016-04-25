package com.integration.action.order;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.integration.entity.Order;
import com.integration.entity.Room;
import com.integration.entity.User;
import com.integration.service.OrderService;
import com.integration.service.RoomService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import sun.usagetracker.UsageTrackerClient;

public class SaveOrderAction extends ActionSupport{
	private Order order;
	private Room room;
	private User user;
	private OrderService orderService;
	private RoomService roomService;
	private String message;
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public OrderService getOrderService() {
		return orderService;
	}
	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}
	public RoomService getRoomService() {
		return roomService;
	}
	public void setRoomService(RoomService roomService) {
		this.roomService = roomService;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Map request=(Map) ActionContext.getContext().get("request");
		request.put("listRoom", this.roomService.findAllRoom());
		return SUCCESS;
	}
	public String add(){
		Room roomUser=this.roomService.findRoomById(room.getRoomid());
		if (roomUser.getStatus()==0) {
			HttpServletRequest request=ServletActionContext.getRequest();
			HttpSession session=request.getSession();
			User user=(User) session.getAttribute("user");
			order.setUserid(user.getUserid());
			this.orderService.saveOrder(order);
			roomUser.setStatus(1);
			this.roomService.updateRoom(roomUser);
			return "addSuc";
		}else{
			message="该房间已有客人入住了";
			return "addFail";
		}
	}
}
