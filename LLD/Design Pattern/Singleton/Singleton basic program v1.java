package com.java.examples;

//Company ServiceNow (Client)
class A {
	public static void main(String[] args) {
		Singleton obj1=Singleton.getInstance();
		Singleton obj2=Singleton.getInstance();
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj1.equals(obj2));  //System.out.println(obj1==obj2);
		obj1=obj2=null;
		System.gc();
	}
}

//Company Oracle
class Singleton {
	int x;
	int y;
	static Singleton obj = null;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if(obj==null)
			obj=new Singleton();
		return obj;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
