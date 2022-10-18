package com.hashmap_04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Least_greaterThan {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		TreeMap<Integer, String> hm=new TreeMap<Integer, String>();
		hm.put(10, "Sutudent");
		hm.put(20, "Rahul");
		hm.put(30, "Sonal");
		hm.put(30, "Pratik");
		hm.put(40, null);
		hm.put(50, "Swapnil");
		
		System.out.println("Enter Key : ");
		int check=sc.nextInt();
		
		System.out.println("By Using Function----------");
		System.out.println("Keys : "+hm.ceilingKey(check));
		System.out.println();
		System.out.println("by Using Iterator---------------");
		int sum=0;
		Set<Entry<Integer, String>> set=hm.entrySet();
		for(Entry<Integer, String> en : set) 
		{
			Integer i=en.getKey();
			if(i==check) 
			{
				System.out.println(en.getKey()+" "+en.getValue());
			sum=1;
			}
			
		}
		if(sum!=1) 
		{
			System.out.println("Keys : null");
		}
	}

}
