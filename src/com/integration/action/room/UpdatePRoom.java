package com.integration.action.room;

import com.integration.entity.Room;
import com.integration.service.RoomService;
import com.opensymphony.xwork2.ActionSupport;

import freemarker.template.utility.Execute;

public class UpdatePRoom extends ActionSupport{
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
		this.room=roomService.findRoomById(room.getRoomid());
		return SUCCESS;
	}
}
