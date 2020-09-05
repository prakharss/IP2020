package com.treebo.dao;

import com.treebo.models.Hotel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class HotelDaoImpl implements HotelDao {

    private static HotelDaoImpl hotelDao;
    private List<Hotel> hotel;
    
    public HotelDaoImpl getInstance() {
        if (hotelDao == null) {
        	hotelDao = new HotelDaoImpl();
        }
        return hotelDao;
    }

	public HotelDaoImpl() {
		super();
		this.hotel = new ArrayList<>();
		
		for(int i=0;i<10;i++) {
			Hotel hotel=new Hotel("name"+i,false);
		}
		for(int i=10;i<20;i++) {
			Hotel hotel=new Hotel("name"+i,true);
		}
	}

	public UUID addHotel(String name, boolean isHot) {
		// TODO Auto-generated method stub
		return null;
		
	}

	public void deleteHotel(UUID number) {
		// TODO Auto-generated method stub
		
	}
}
