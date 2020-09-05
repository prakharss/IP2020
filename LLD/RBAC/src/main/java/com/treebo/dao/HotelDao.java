package com.treebo.dao;

import java.util.UUID;

public interface HotelDao {
	UUID addHotel(String name, boolean isHot);
    void deleteHotel(UUID number);
}
