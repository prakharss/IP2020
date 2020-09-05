package com.treebo.services;

import java.util.List;

import com.treebo.models.Hotel;

public interface HotelTreebo {
	List<Integer> checkIn(int n,Hotel hotel);
    boolean checkOut(List<Integer> rooms,Hotel hotel);
}
