package com.hashmap_03;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Mapping {
	

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
		String day=sc.next();
		
		
		Set<Entry<Integer, String>> set=hs.entrySet();
		for(Map.Entry<Integer, String> en : set) 
		{
			if(en.getValue().contains(day))
			{
				
				System.out.println(en.getValue().contains(day));
			}

		}
	
		
	}

}
