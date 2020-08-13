package com.java.examples;

class C {
	A get() {  //parent
		return new A();
	}
}

class D extends C {
	B get() {  //child
		return new B();
	}
}

class A {
	public static void main(String args[]) {
		System.out.println("asdd");
		new D().get().yo();
	}
}

class B extends A {
	void yo() {
		System.out.println("afsdafafaff");
	}
}
