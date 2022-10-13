package com.hashmap_02;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
public class HashMapToTreeMap {

	public static void main(String[] args) 
	{
		HashMap<Integer, String> it=new HashMap<>();
		
		it.put(5, "Rahul");
		it.put(2, "Nilesh");
		it.put(1, "Sushant");
		it.put(3, "Sachin");
		it.put(4, "Samir");
		it.put(7, "Faraq");
		it.put(6, "Pratik");
		System.out.println(it);
		
		TreeMap<Integer, String> ts=new TreeMap<Integer, String>(it);
		System.out.println(ts);
	}

}
