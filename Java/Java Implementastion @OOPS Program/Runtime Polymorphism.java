//1st
package com.oops.polymorphism;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Animal{
	void sound() {
		System.out.println("Animal sound");
	}
	
	void common() {
		System.out.println("Common");
	}
}

class Dog extends Animal{
	@Override
	void sound() {
		System.out.println("Dog sound");
	}
}

class Horse extends Animal {
	@Override
	void sound() {
		System.out.println("Horse sound");
	}
	
	void run() {
		System.out.println("Horse Run");
	}
}

public class RuntimePolymorphism {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Animal a;
		Animal[] arr = new Animal[5]; // arr[null, null, null, null, null]
		
		Horse h = new Horse(); // Can call all the methods of Animal and Horse
		h.common();
		h.run();
		h.sound();
		Animal b = new Horse(); // Can only call Animal's own method and overriden Horse's method
		b.common();
		b.sound();
		//b.run(); Compile Error : The method run() is undefined for the type Animal 
		
		while(true) {
			String animal = sc.next();
			if(animal.equals("Dog")) {
				a = new Dog();
			}else if(animal.equals("Horse")) {
				a = new Horse();
			}else {
				a = new Animal();
			}
			a.sound();
		}
	}

}

//2nd
class Shape{  
void draw(){System.out.println("drawing...");}  
}  
class Rectangle extends Shape{  
void draw(){System.out.println("drawing rectangle...");}  
}  
class Circle extends Shape{  
void draw(){System.out.println("drawing circle...");}  
}  
class Triangle extends Shape{  
void draw(){System.out.println("drawing triangle...");}  
}  
class TestPolymorphism2{  
public static void main(String args[]){  
Shape s;  
s=new Rectangle();  
s.draw();  
s=new Circle();  
s.draw();  
s=new Triangle();  
s.draw();  
}  
}