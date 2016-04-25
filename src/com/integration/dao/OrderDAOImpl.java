package com.integration.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.integration.entity.Order;
import com.integration.entity.User;

public class OrderDAOImpl extends HibernateDaoSupport implements OrderDAO {
  
	@Override
	public void saveOrder(Order ordr) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(ordr);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Order> findAllOrder() {
		// TODO Auto-generated method stub
		String hsql="from Order ord order by ord.orderid asc";
		return this.getHibernateTemplate().find(hsql);
	}

	@Override
	public void removeOrder(Order order) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(order);
	}

	@Override
	public void updateOrder(Order order) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(order);
	}

	@Override
	public Order findOrderById(int id) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Order.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Order> getUserOrder(User user) {
		// TODO Auto-generated method stub
		String hsql="from Order ord where ord.userid='"+user.getUserid()+"'";
		return this.getHibernateTemplate().find(hsql);
	}

	@Override
	public List<Order> findOrderByUserdAndRoomid(int userid, int roomid) {
		// TODO Auto-generated method stub
		String hsql="from Order ord where ord.userid='"+userid+"' and ord.roomid='"+roomid+"'";
		return this.getHibernateTemplate().find(hsql);
	}

}
