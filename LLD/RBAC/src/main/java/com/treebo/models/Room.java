package com.treebo.models;

import lombok.Getter;

@Getter
public class Room {
 
    private int number;
    private boolean status;

    public Room(int number) {
        this.number = number;
        this.status = false;
    }

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public boolean isStatus() {
		return status;
	}
}
