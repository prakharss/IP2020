package com.treebo.dao;

import java.util.HashMap;

public class RoomDaoImpl implements RoomDao {

    private static RoomDaoImpl roomDao;

    public RoomDaoImpl getInstance() {
        if (roomDao == null) {
        	roomDao = new RoomDaoImpl();
        }
        return roomDao;
    }

	public boolean addRoom(int number) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteRoom(int number) {
		// TODO Auto-generated method stub
		return false;
	}
}
