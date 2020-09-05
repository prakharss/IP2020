package com.treebo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.treebo.models.Hotel;
import com.treebo.models.Room;
import com.treebo.services.HotelTreebo;
import com.treebo.services.HotelTreeboImpl;

public class Main {

    public static void main(String[] args) {
        // write your code here
    	HotelTreebo hotelImpl=HotelTreeboImpl.getInstance();
       
    	int n=5;
    	Hotel hotelInGoa=new Hotel("HotelInGoa",false);
    	
    	List<Integer> rooms=hotelImpl.checkIn(n,hotelInGoa);
    	
    	n=3;
    	Hotel hotelInRajasthan=new Hotel("HotelInRajasthan",true);
    	rooms=hotelImpl.checkIn(n,hotelInRajasthan);
    	
    	List<Integer> checkoutRoomsInGoaHotel = new ArrayList<Integer>();
    	checkoutRoomsInGoaHotel.add(101);
    	checkoutRoomsInGoaHotel.add(201);
    	checkoutRoomsInGoaHotel.add(202);
    	hotelImpl.checkOut(checkoutRoomsInGoaHotel, hotelInGoa);
    	
    	List<Integer> checkoutRoomsInRajasthanHotel = new ArrayList<Integer>();
    	checkoutRoomsInRajasthanHotel.add(105);
    	checkoutRoomsInRajasthanHotel.add(204);
    	checkoutRoomsInRajasthanHotel.add(103);
    	hotelImpl.checkOut(checkoutRoomsInRajasthanHotel, hotelInRajasthan);
    }
}
