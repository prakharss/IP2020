package com.java.examples;

import java.util.*;

//Client of Company X
class A {  //A is client
	public static void main(String[] args) {
		String typeOfOs="Linux";
		OS obj=FactoryBean.getInstance(typeOfOs);
		obj.memoryManagement();
	}
}

//Company X
class FactoryBean {
	static private Map<String, OS> map=new HashMap<String,OS>();
	static private int x=-1;
	
	private static void init() {
		map.put("Android", new Android());
		map.put("Linux", new Linux());
		map.put("Windows", new Windows());
	}
	
	public static OS getInstance(String typeOfOs) {
		if(x==-1) {
			init();
			x=1;
		}
		return map.get(typeOfOs);
	}
}

interface OS {
	void memoryManagement();
	void createProcess();
}

class Android implements OS {
	@Override
	public void memoryManagement() {
		System.out.println("memoryManagement in Android");
	}
	@Override
	public void createProcess() {
	
	}
}

class Linux implements OS {
	@Override
	public void memoryManagement() {
		System.out.println("memoryManagement in Linux");
	}
	@Override
	public void createProcess() {
		
	}
}

class Windows implements OS {
	@Override
	public void memoryManagement() {
		System.out.println("memoryManagement in Windows");
	}
	@Override
	public void createProcess() {
		
	}
}


