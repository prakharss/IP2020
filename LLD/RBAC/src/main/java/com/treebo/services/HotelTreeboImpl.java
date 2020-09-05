package com.treebo.services;

import java.util.List;

import com.treebo.models.Hotel;
import com.treebo.models.Room;

/** Service Layer **/
public class HotelTreeboImpl implements HotelTreebo {
    private static HotelTreebo hotelTreebo;

    public static HotelTreebo getInstance() {
        if (hotelTreebo == null) {
        	hotelTreebo = new HotelTreeboImpl();
        }
        return hotelTreebo;
    }
    
    //
    public List<Integer> checkIn(int n, Hotel hotel) {
    	RoomAllocationStrategy roomAllocationStrategy;
    	//map //factory and cascade design pattern
    	//only 2 possibilities
    	if(hotel.isHot()) 
    		roomAllocationStrategy=new BottomUpRoomAllocationStrategy();
    	else 
    		roomAllocationStrategy=new TopDownRoomAllocationStrategy();
 
    	List<Integer> roomsList=roomAllocationStrategy.allocateRoom(n);
        return null;
    }
    
	public boolean checkOut(List<Integer> checkoutRooms, Hotel hotel) {
		List<Room> roomsInHotel=hotel.getRooms();
		//loop to checkout rooms
		//we can use map ib Room.java to make it efficient
		for(int i=0;i<roomsInHotel.size();i++) {
			if(checkoutRooms.contains(roomsInHotel.get(i).getNumber()))
				roomsInHotel.get(i).setStatus(false);
		}
		return true;
	}
}
