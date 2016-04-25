package com.integration.service;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.integration.dao.OrderDAO;
import com.integration.entity.Order;
import com.integration.entity.User;

public class OrderServiceImpl extends HibernateDaoSupport implements OrderService {
	private OrderDAO orderDao;
	
	public OrderDAO getOrderDao() {
		return orderDao;
	}

	public void setOrderDao(OrderDAO orderDao) {
		this.orderDao = orderDao;
	}

	@Override
	public void saveOrder(Order ordr) {
		// TODO Auto-generated method stub
		this.orderDao.saveOrder(ordr);
	}

	@Override
	public List<Order> findAllOrder() {
		// TODO Auto-generated method stub
		return this.orderDao.findAllOrder();
	}

	@Override
	public void removeOrder(Order order) {
		// TODO Auto-generated method stub
		this.orderDao.removeOrder(order);
	}

	@Override
	public void updateOrder(Order order) {
		// TODO Auto-generated method stub
		this.orderDao.updateOrder(order);
	}

	@Override
	public Order findOrderById(int id) {
		// TODO Auto-generated method stub
		return this.orderDao.findOrderById(id);
	}

	@Override
	public List<Order> getUserOrder(User user) {
		// TODO Auto-generated method stub
		return this.orderDao.getUserOrder(user);
	}

	@Override
	public List<Order> findOrderByUserdAndRoomid(int userid, int roomid) {
		// TODO Auto-generated method stub
		return this.orderDao.findOrderByUserdAndRoomid(userid, roomid);
	}
}
