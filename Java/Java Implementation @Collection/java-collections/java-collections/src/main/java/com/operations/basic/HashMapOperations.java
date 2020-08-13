package com.operations.basic;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMapOperations {
	
	public static Map<String, String> map;
	
	public void create() {
		map = new HashMap<>();
	}
	
	public void createLinkedHashMap() {
		map = new LinkedHashMap<>();
	}
	
	public void createTreeMap() {
		map = new TreeMap<>();
	}
	
	public void createOrderedTreeMap() {
		map = new TreeMap<>(Comparator.reverseOrder());
	}
	
	public void create(Map<String, String> inputMap) {
		map = inputMap;
	}
	
	public void add(String key, String value) {
		map.put(key, value);
	}
	
	public void addIfAbsent(String key, String value) {
		map.putIfAbsent(key, value);
	}
	
	public void addAll(Map<String, String> inputMap) {
		map.putAll(inputMap);
	}
	
	public void remove(String key) {
		map.remove(key);
	}
	
	public void removeByVal(String key, String value) {
		map.remove(key, value);
	}
	
	public void clear() {
		map.clear();
	}
	
	public int size() {
		return map.size();
	}
	
	public boolean containsKey(String key) {
		return map.containsKey(key);
	}
	
	public boolean containsValue(String value) {
		return map.containsValue(value);
	}
	
	public void replace(String key, String value) {
		map.replace(key, value);
	}
	
	public void replaceByVal(String key, String oldValue, String newValue) {
		map.replace(key, oldValue, newValue);
	}
	public void getValues() {
		Collection<String> collection =  map.values();
		System.out.println("\nValues in Map : ");
		for(String s : collection) {
			System.out.println(s+" ");
		}
		System.out.println();
	}
	
	public void getKeys() {
		Set<String> set = map.keySet();
		System.out.print("\nKeys in Map : ");
		for(String s : set) {
			System.out.print(s+ " ");
		}
		System.out.println();
	}
	
	public void getKeyValuePair() {
		Set<Entry<String, String>> m = map.entrySet();
		System.out.println("\nKey Value Pairs");
		for(Entry<String, String> e : m) {
			System.out.println(e.getKey() +"->"+e.getValue());
		}
		System.out.println();
	}
	
	public String get(String key) {
		return map.get(key);
	}
	
	public void hashMapExample() {
		System.out.println("\n\n*****HashMap Operations : START*****\n");
		HashMapOperations hashMap = new HashMapOperations();
		hashMap.create();
		hashMap.add("First", "First");
		hashMap.add(null, "null");
		hashMap.add("Second",  "Second");
		hashMap.get(null);
		hashMap.getKeys();
		hashMap.getValues();
		hashMap.getKeyValuePair();
		System.out.println(map);
		System.out.println("\n\n*****HashMap Operations : END*****\n");
		hashMap.clear();
		System.out.println("\n\n*****LinkedHashMap Operations : START*****\n");
		hashMap.createLinkedHashMap();
		hashMap.add("First", "First");
		hashMap.add(null, "null");
		hashMap.add("Second",  "Second");
		hashMap.get(null);
		hashMap.getKeys();
		hashMap.getValues();
		hashMap.getKeyValuePair();
		System.out.println(map);
		System.out.println("\n\n*****LinkedHashMap Operations : END*****\n");
		hashMap.clear();
		System.out.println("\n\n*****TreeMap Operations : START*****\n");
		hashMap.createTreeMap();
		hashMap.add("First", "First");
		hashMap.add("Zillion", "null");
		hashMap.add("Second",  "Second");
		hashMap.get("Zillion");
		hashMap.getKeys();
		hashMap.getValues();
		hashMap.getKeyValuePair();
		System.out.println(map);
		System.out.println("\n\n*****TreeMap Operations : END*****\n");
		hashMap.clear();
		System.out.println("\n\n*****Ordered TreeMap Operations : START*****\n");
		hashMap.createOrderedTreeMap();
		hashMap.add("First", "First");
		hashMap.add("Zillion", "null");
		hashMap.add("Second",  "Second");
		hashMap.get("Zillion");
		hashMap.getKeys();
		hashMap.getValues();
		hashMap.getKeyValuePair();
		System.out.println(map);
		System.out.println("\n\n*****Ordered TreeMap Operations : END*****\n");
	}
}
