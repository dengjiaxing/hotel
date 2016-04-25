package com.integration.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.integration.entity.Room;

public class RoomDAOImpl extends HibernateDaoSupport implements RoomDAO {


	@Override
	public void saveRoom(Room room) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(room);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Room> findAllRoom() {
		// TODO Auto-generated method stub
		String hsql="from Room room order by room.roomid asc";
		return this.getHibernateTemplate().find(hsql);
	}

	@Override
	public void removeRoom(Room room) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(room);
	}

	@Override
	public void updateRoom(Room room) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(room);
	}

	@Override
	public Room findRoomById(int id) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Room.class, id);
	}

}
