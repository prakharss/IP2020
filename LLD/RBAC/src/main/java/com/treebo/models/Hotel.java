package com.treebo.models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import lombok.Getter;

@Getter
public class Hotel {
	private String name;
	private UUID number;
    private boolean isHot;
    
    //Map<Integer, Room> map;
    List<Room> rooms;
	
	public Hotel(String name, boolean isHot) {
		this.name = name;
    	this.number = UUID.randomUUID();
		this.isHot = isHot;
		rooms=new ArrayList<Room>();
		
		for(int i=0;i<10;i++) {
			this.rooms.add(new Room(i+100));
		}
		for(int i=0;i<10;i++) {
			this.rooms.add(new Room(i+200));
		}
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public UUID getNumber() {
		return number;
	}

	public void setNumber(UUID number) {
		this.number = number;
	}

	public boolean isHot() {
		return isHot;
	}

	public void setHot(boolean isHot) {
		this.isHot = isHot;
	}

	public List<Room> getRooms() {
		return rooms;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}
}
