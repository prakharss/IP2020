package com.java.examples;

import java.util.*;

/*
Client A of Company X

File1 [Cart related file] (street, zipCode) [we only need zipCode to determine whether to deliver at
this place or not]
-> make a address with it's attributes
-> make validation on any it's attributes of address (independently)
-> to determine exact point of point of failure of it's attribute
-> validate all it's attributes of given address in 1 API

File2 [Order delivery] (street, city, zipCode) 
-> make a address with it's attributes
-> make validation on any it's attributes of address (independently)
-> to determine exact point of point of failure of it's attribute
-> validate all it's attributes of given address in 1 API
*/

/*
==== Cascade Builder Pattern ====
Story:
    Amazon requires an Address validation system.
    Address have certain attributes (street, zipcode, state).
    Clients here are  Cart team, Order dispatch team
    Different clients have different validated attribute requirements.

    Requirements:
    - point of failure should be handled
    - relation between entity can be taken care off
    - Clients code should not be dirty
    - Different clients should have different requirements

Build up a complete system for Amazon clone matching the above requirements.
*/

//Client A of Company X
class A {
	public static void main(String[] args) {
		Address address = new Address(100, "street", "Delhi"); // this now fix (assume)

		// Anyone can use this
		boolean isCorrectCity = new CityValidator().validate(address);
		System.out.println(isCorrectCity);

		// File1 (zipCode) -> cartTeam
		// Validate the whole address
		boolean isCorrectAddressFile1 = AddressValidator.validate("cartTeam", address);
		System.out.println(isCorrectAddressFile1);

		// File2 (street,city) -> dispatchTeam
		// Validate the whole address
		boolean isCorrectAddressFile2 = AddressValidator.validate("dispatchTeam", address);
		System.out.println(isCorrectAddressFile2);
	}
}

//Company X
class Address {
	String street; /* Not Null */
	int zipCode; /* 1 to 100 */
	String city; /* Hyderabad, Delhi */

	public Address(int zipCode, String street, String city) {
		super();
		this.zipCode = zipCode;
		this.street = street;
		this.city = city;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}

class AddressValidator {
	static Map<String, List<Validator>> map = new HashMap<String, List<Validator>>();
	static AddressValidator obj = null;

	private AddressValidator() {
		// cartTeam
		map.put("cartTeam", new ArrayList<Validator>(Arrays.asList(new ZipValidator())));
		// dispatchTeam
		map.put("dispatchTeam", new ArrayList<Validator>(Arrays.asList(new StreetValidator(), new CityValidator())));
	}

	public static boolean validate(String type, Address address) {
		if (obj == null)
			obj = new AddressValidator();

		List<Validator> listOfValidators = map.get(type);
		String className = null;

		//Cascading name because of this for loop
		for (int i = 0; i < listOfValidators.size(); i++) {
			if (!listOfValidators.get(i).validate(address)) {
				className = listOfValidators.get(i).getClass().getSimpleName();
				System.out.print(className + " failed ");
				return false;
			}
		}
		return true;
	}
}

interface Validator {
	public boolean validate(Address address);
}

class StreetValidator implements Validator {
	public boolean validate(Address address) {
		if (address.street != null)
			return true;
		return false;
	}
}

class ZipValidator implements Validator {
	public boolean validate(Address address) {
		if (address.zipCode >= 1 && address.zipCode <= 100)
			return true;
		return false;
	}
}

class CityValidator implements Validator {
	public boolean validate(Address address) {
		if (address.city.equals("Hyderabad") || address.city.equals("Delhi"))
			return true;
		return false;
	}
}
