package com.integration.action.room;

import com.integration.entity.Room;
import com.integration.service.RoomService;
import com.opensymphony.xwork2.ActionSupport;

public class SaveRoomAction extends ActionSupport{
	private Room room;
	private RoomService roomService;
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
	public RoomService getRoomService() {
		return roomService;
	}
	public void setRoomService(RoomService roomService) {
		this.roomService = roomService;
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		this.roomService.saveRoom(room);
		return SUCCESS;
	}
}
