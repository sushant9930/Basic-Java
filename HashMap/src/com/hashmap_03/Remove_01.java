package com.hashmap_03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class Remove_01 {
	
	static void check(HashMap<Integer, String> hs, Integer day) 
	{
		Set<Map.Entry<Integer, String>> set= hs.entrySet();
		Iterator<Entry<Integer, String>> itr =set.iterator();
		while(itr.hasNext()) 
		{
			itr.next();
			itr.remove();
		}
		System.out.println(hs);
	}

	static void check_01(HashMap<Integer, String> hs, Integer day) 
	{
		Set<Map.Entry<Integer, String>> set= hs.entrySet();
		Iterator<Entry<Integer, String>> itr =set.iterator();
		while(itr.hasNext()) 
		{
			if(itr.next().getKey().equals(day)) 
			{
				itr.remove();
			}
		}
		System.out.println(hs);
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		HashMap<Integer, String> hs=new HashMap<Integer, String>();
		hs.put(1, "Sunday");
		hs.put(2, "Monday");
		hs.put(3, "Tuesday");
		hs.put(4, "Wednesday");
		hs.put(5, "Thursday");
		hs.put(6, "Friday");
		hs.put(7, "Saturday");
		
	     System.out.println("Enter Day");
		Integer day=sc.nextInt();
		
		check_01(hs, day);
		check(hs, day);
		
	
	}

}
