package com.operations.basic;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class CursorsOperations {

	public void cursorImpl() {
		System.out.println("*****Cursor Implementations : START******\n");
		System.out.println("4 different types : Enumeration || Iterator || ListIterator || Spliterator");
		System.out.println("Enumeration is applicable to only Legacy classes objects");
		System.out.println("Iterator is applicable to all collection objects");
		System.out.println("ListIterator is applicable to only List Objects\n");
		System.out.println("--- Enumeration ---");
		Vector<Integer> vector = new Vector<>();
		vector.add(1);
		vector.addElement(2);
		System.out.print("Elements in vector : ");
		Enumeration<Integer> enumeration = vector.elements();
		while(enumeration.hasMoreElements()) {
			System.out.print(enumeration.nextElement()+" ");
		}
		
		System.out.println("\n\n--- Iterator ---");
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);
		System.out.print("Elements in arrayList before Removing : ");
		Iterator<Integer> iterator = arrayList.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
		
		iterator = arrayList.iterator();
		
		if(iterator.hasNext()) {
			iterator.next();
			iterator.remove();
		}
		
		System.out.print("\nElements in arrayList after Removing : ");
		
		iterator.forEachRemaining((integer)->{
			System.out.print(integer+" ");
		});
		
		System.out.println("\n\n--- ListIterator ---");
		ArrayList<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		
		System.out.println("Elements in list in forward direction : ");
		ListIterator<Integer> listIterator = list.listIterator();
	
		while(listIterator.hasNext()) {
			System.out.println(listIterator.nextIndex()+" : "+listIterator.next());
			listIterator.set(1);
			listIterator.add(0);
		}
		
		System.out.println("\nElements in list in backward direction : ");
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previousIndex()+" : "+listIterator.previous());
		}
		
		System.out.println("\n\n*****Cursor Implementations : END******");
	}
}
