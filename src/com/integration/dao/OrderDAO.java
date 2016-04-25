package com.integration.dao;

import java.util.List;

import com.integration.entity.Order;
import com.integration.entity.User;

public interface OrderDAO {
	public void saveOrder (Order ordr);
	public List<Order> findAllOrder();
	public void removeOrder(Order order);
	public void updateOrder(Order order);
	public Order findOrderById(int id);
	public List<Order> getUserOrder(User user);
	public List<Order> findOrderByUserdAndRoomid(int userid,int roomid);
	
	
}
