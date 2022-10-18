package com.hashmap_04;

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class LowerKey {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		TreeMap<Integer, String> hm=new TreeMap<Integer, String>();
		hm.put(10, "Sutudent");
		hm.put(20, "Rahul");
		hm.put(80, "Sonal");
		hm.put(30, "Pratik");
		hm.put(40, null);
		hm.put(50, "Swapnil");
		
		System.out.println("Enter Key : ");
		int check=sc.nextInt();
		
		System.out.println("by using function-------");
		System.out.println("Keys : "+hm.lowerKey(check));
		System.out.println();
		
		
	}

}
