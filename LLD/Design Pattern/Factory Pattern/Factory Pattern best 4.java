package com.java.examples;

import java.util.*;

//Client of Company X
class A {  //A is client
	public static void main(String[] args) {
		String typeOfOs="Linux";
		OS obj=FactoryBean.getFactoryObject().getOperatingSystem(typeOfOs);
		obj.memoryManagement();
	}
}

//Company X
class FactoryBean {
	static private Map<String, OS> map=new HashMap<String,OS>();
	static FactoryBean obj=null; 
	
	private FactoryBean() {
		map.put("Android", new Android());
		map.put("Linux", new Linux());
		map.put("Windows", new Windows());
	}
	
	public OS getOperatingSystem(String typeOfOs) {
		return map.get(typeOfOs);
	}
	
	public static FactoryBean getFactoryObject() {
		if(obj==null) {
			obj=new FactoryBean();
		}
		return obj;
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


