package com.treebo.models;

import lombok.Getter;

import java.util.List;

@Getter
public class Guest {
    private String firstName;
    private String lastName;
    private String email;
    private List<Room> rooms;

    public Guest(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.email = email;
        this.lastName = lastName;
    }

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}
}


//User
/*
 * 
 * 
 * 
 */

//Role

//

