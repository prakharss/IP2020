package com.treebo.services;

import java.util.List;
import java.util.UUID;

import com.treebo.models.Hotel;
import com.treebo.models.Room;

public interface RoomAllocationStrategy {
	List<Integer> allocateRoom(int rooms);
}
