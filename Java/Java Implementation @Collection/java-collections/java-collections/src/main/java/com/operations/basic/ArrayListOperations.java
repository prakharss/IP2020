package com.operations.basic;

import java.util.ArrayList;

public class ArrayListOperations {
	
	public static ArrayList<String> arr;
	
	public void createEmpty() {
		arr = new ArrayList<>();
	}
	
	public void createArr(ArrayList<String> strArr) {
		arr = new ArrayList<>(strArr);
	}
	
	public void createArrCap(int capacity) {
		arr = new ArrayList<>(capacity);
	}
	
	public void add(String str) {
		arr.add(str);
	}
	
	public void add(int index, String str) {
		arr.add(index, str);
	}
	
	public void addAll(ArrayList<String> strArr) {
		arr.addAll(strArr);
	}
	
	public void addAll(int index, ArrayList<String> strArr) {
		arr.addAll(index, strArr);
	}
	
	public void clear() {
		arr.clear();
	}
	
	public String get(int index) {
		return arr.get(index);
	}
	
	public int indexOf(String str) {
		return arr.indexOf(str);
	}
	
	public int lastIndexOf(String str) {
		return arr.lastIndexOf(str);
	}
	
	public void remove(String str) {
		arr.remove(str);
	}
	
	public void removeFromIndex(int index) {
		arr.remove(index);
	}
	
	public void removeAll(ArrayList<String> arr) {
		arr.removeAll(arr);
	}
	
	public void replace(int index, String str) {
		arr.set(index, str);
	}
	
	public int getSize() {
		return arr.size();
	}
	
	public boolean isEmpty() {
		return arr.isEmpty();
	}
	
	public void arrayListExample() {
		System.out.println("Creating Empty ArrayList");
		ArrayListOperations a = new ArrayListOperations();
		a.createEmpty();
		System.out.println("Size of array : "+a.getSize());
		System.out.println("Is array empty : "+a.isEmpty());
		System.out.println("Addition of null and duplicates allowed");
		System.out.println("Adding : null, null, Aakanksha, Anku, UHG");
		a.add(null);
		a.add(null);
		a.add("Aakanksha");
		a.add("Anku");
		a.add("UHG");
		System.out.println("Size of array : "+a.getSize());
		System.out.println("Is array empty : "+a.isEmpty());
		System.out.println("Element at index 0 : " + arr.get(0));
		System.out.println("Changing it to Test");
		a.replace(0, "Test");
	}

}
