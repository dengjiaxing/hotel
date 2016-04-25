package com.integration.action.order;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.integration.entity.Order;
import com.integration.entity.Room;
import com.integration.service.OrderService;
import com.integration.service.RoomService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import freemarker.template.utility.Execute;

public class ListOrderAction extends ActionSupport{
	private Order order;
	private Room room;
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
		List<Order> orders=this.orderService.findAllOrder();
		List<Room> rooms=new ArrayList<Room>();
		if(orders.size()>0){
			for(Order order:orders){
			rooms.add(this.roomService.findRoomById(order.getRoomid()));
			}
		}
		Map requestList=(Map) ActionContext.getContext().get("request");
		requestList.put("listAllRoom", rooms);
		return SUCCESS;
	}
	
	
}
