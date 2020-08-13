package com.operations.basic;

import java.util.Scanner;

public class MainController {

	public static void main(String[] args) {
		ArrayListOperations a = new ArrayListOperations();
		a.arrayListExample();
		System.out.println();
		CursorsOperations c = new CursorsOperations();
		c.cursorImpl();
		HashMapOperations m = new HashMapOperations();
		m.hashMapExample();
	}
}
