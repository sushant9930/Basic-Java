package com.hashmap_01;
import java.util.*;
import java.util.Map;
import java.util.Map.Entry;
public class Example_01 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hs=new HashMap<Integer, String>();
		hs.put(4, "Rahul");
		hs.put(5, "Hetal");
		hs.put(1, "Pratik");
		hs.put(2, "Nilesh");
		
		System.out.println(hs);
		
		HashMap<String, String> h=new HashMap<String, String>();
		h.put("14", "Rahul");
		h.put("50", "Hetal");
		h.put("100", "Pratik");
		h.put("21", "Nilesh");
		
		System.out.println(h);
	
		Set<Entry<String, String>>hh=h.entrySet();	
		Iterator<Entry<String, String>> it2=hh.iterator();
		while(it2.hasNext()) 
		{
			Entry<String, String> h0=it2.next();
			System.out.println(h0.getKey()+" "+h0.getValue());
		}
	}
}
