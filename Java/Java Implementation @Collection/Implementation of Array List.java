package com.java.examples;
import java.util.Arrays;

class ArrayList1 {
	static int DEF_SIZE = 2;
	int currSize = 0;
	Integer[] elements;

	ArrayList1() {
		elements = new Integer[DEF_SIZE];
	}

	public void add(Integer val) {
		if (currSize == elements.length) {
			addUtil();
		}
		elements[currSize++] = val;
	}

	private void addUtil() {
		int newSize = elements.length * 2;
		elements = Arrays.copyOf(elements, newSize);
	}

	public Integer get(int idx) {
		if (idx < 0 || idx >= currSize)
			return -1;
		return elements[idx];
	}

	public int size() {
		return currSize;
	}

	public void remove(int idx) {
		if (idx < 0 || idx >= currSize)
			return;
		currSize = currSize - 1;
		int i = 0;
		for (i = idx; i < currSize; i++)
			elements[i] = elements[i + 1];
		elements[i] = null;
	}
}

class A {
	public static void main(String[] args) {
		ArrayList1 list = new ArrayList1();
		list.add(10);
		list.add(12);
		list.add(14);
		list.remove(2);
		list.add(15);
		list.add(18);
		list.remove(2);
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
}