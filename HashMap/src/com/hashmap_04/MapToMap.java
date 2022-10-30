package com.hashmap_04;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
public class MapToMap {
	
	

	public static void main(String[] args) 
	{
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(10, "Sutudent");
		hm.put(20, "Rahul");
		hm.put(30, "Sonal");
		hm.put(30, "Pratik");
		hm.put(40, null);
		hm.put(50, "Swapnil");
		
		TreeMap<Integer, String> tm=new TreeMap<Integer, String>(hm);
		//Set<Entry<Integer, String>> entry = tm.entrySet();
		for(Entry<Integer, String> en : tm.entrySet()) 
		{
			System.out.println(en.getKey()+" "+en.getValue());
		}
		
		System.out.println("-----------------------------------");
		Iterator<Entry<Integer, String>> itr = tm.entrySet().iterator();
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
		
		
		
	}

}
