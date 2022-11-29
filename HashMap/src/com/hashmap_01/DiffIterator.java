package com.hashmap_01;

import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
public class DiffIterator {

	public static void main(String[] args) 
	{
		HashMap<Integer, String> m=new HashMap<Integer, String>();
		
		m.put(1, "Sushant");
		m.put(2,  "Neha");
		m.put(3,  "Rahul");
		m.put(4,  "Swapnil");
		m.put(5, "Ramesh");
		m.put(6,"Ritik");
		m.put(7, "Rohan");
		m.put(8, "Ashwin");
		
		TreeMap<Integer, String> tm=new TreeMap<Integer, String>();
		tm.putAll(m);
		System.out.println(tm.descendingMap());
		
		
		
	/*	
		// using enhance for loop iteration over Map.entrySet()
		for(Map.Entry<Integer, String> e: m.entrySet()) 
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
		
		System.out.println("----------------------------------------");
		//using KeySet() for iteration over keys
		for(Integer i:m.keySet()) 
		{
			System.out.println("Key "+i);
		}
		System.out.println("----------------------------------------");
		//using value() for iteration over values
		for(String s:m.values()) 
		{
			System.out.println("Values "+s);
		}
		System.out.println("----------------------------------------");
		//using iterator
		Iterator <Map.Entry<Integer, String>> itr=m.entrySet().iterator();
		while(itr.hasNext()) 
		{
			Map.Entry<Integer, String> entry =itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		System.out.println("----------------------------------------");
		//lopping over keys
		for(Integer name: m.keySet()) 
		{
			String url=m.get(name);
			System.out.println(name+" "+url);
		}
		
		System.out.println("----------------------------------------");
		//forEach(action) method to iterate map
		m.forEach((K,V) -> System.out.println(K+" "+V));
		*/
	}

}
