package com.integration.service;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.integration.dao.RoomDAO;
import com.integration.entity.Room;

public class RoomServiceImpl extends HibernateDaoSupport implements RoomService {

	private RoomDAO roomDao;
	
	public RoomDAO getRoomDao() {
		return roomDao;
	}

	public void setRoomDao(RoomDAO roomDao) {
		this.roomDao = roomDao;
	}

	@Override
	public void saveRoom(Room room) {
		// TODO Auto-generated method stub
		this.roomDao.saveRoom(room);
	}

	@Override
	public List<Room> findAllRoom() {
		// TODO Auto-generated method stub
		return this.roomDao.findAllRoom();
	}

	@Override
	public void removeRoom(Room room) {
		// TODO Auto-generated method stub
		this.roomDao.removeRoom(room);
	}

	@Override
	public void updateRoom(Room room) {
		// TODO Auto-generated method stub
		this.roomDao.updateRoom(room);
	}

	@Override
	public Room findRoomById(int id) {
		// TODO Auto-generated method stub
		return this.roomDao.findRoomById(id);
	}
}
