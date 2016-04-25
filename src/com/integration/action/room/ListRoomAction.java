package com.integration.action.room;

import java.util.Map;

import com.integration.service.RoomService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import freemarker.template.utility.Execute;

public class ListRoomAction extends ActionSupport{
	private RoomService roomService;

	public RoomService getRoomService() {
		return roomService;
	}

	public void setRoomService(RoomService roomService) {
		this.roomService = roomService;
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Map request=(Map) ActionContext.getContext().get("request");
		request.put("list", roomService.findAllRoom());
		return SUCCESS;
	}
}
