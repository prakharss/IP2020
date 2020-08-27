package com.java.examples;

//Client A of Company X
class A {  
	public static void main(String[] args) {
		Bird obj=new BirdBuilder().setColor("yellow").getBird();
	}
}

//Company X
class Bird {
	String color; //fix
	int propertyInVersion2; //fix
	String gender; //fix 
	int weight; //can change (dot walk)
	int price; //can change (dot walk)
	
	public Bird(BirdBuilder obj) {
		this.color = obj.color;
		this.propertyInVersion2 = obj.propertyInVersion2;
		this.gender = obj.gender;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public int getPropertyInVersion2() {
		return propertyInVersion2;
	}

	public String getGender() {
		return gender;
	}
}

class BirdBuilder {
	String color; //fix
	int propertyInVersion2; //fix
	String gender; //fix 
	int weight; //can change (dot walk)
	int price; //can change (dot walk)
	
	public BirdBuilder setColor(String color) {
		this.color = color;
		return this;
	}

	public BirdBuilder setPropertyInVersion2(int propertyInVersion2) {
		this.propertyInVersion2 = propertyInVersion2;
		return this;
	}

	public BirdBuilder setGender(String gender) {
		this.gender = gender;
		return this;
	}

	public BirdBuilder setWeight(int weight) {
		this.weight = weight;
		return this;
	}

	public BirdBuilder setPrice(int price) {
		this.price = price;
		return this;
	}
	
	public Bird getBird() {
		return new Bird(this);
		//return new Bird(color,propertyInVersion2,gender);
	}
}


