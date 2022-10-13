package com.arraylist_03;
import java.util.*;

public class CovertArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(50);
		al.add(80);
		al.add(70);
		
		//first way to convert arraylist to array
		System.out.println("-----Convert ArrayList to Array 01-----");
			Object [] a=al.toArray();
		
		for(Object j:a) 
		{
			System.out.println(j);
		}
		
		//second way to covert arraylist to array
		System.out.println("-----Convert ArrayList to Array 02-----");
		Integer a1[]=new Integer[al.size()];
		a1=al.toArray(a1);
		
		for(Integer x:a1) 
		{
			System.out.print(x+" ");
		}

		//Array to ArrayList
		System.out.println("-----Convert Array to ArrayList 01-----");
		String [] name= {"Sushant", "Nikita", "Rahul", "Suraj"};
		List<String> al1=Arrays.asList(name);
		
		System.out.println(al1);
		
		System.out.println("-----Convert Array to ArrayList 02-----");
		List<String> al01 = new ArrayList<String>();
        Collections.addAll(al01, name);
 
        System.out.println(al01);
				
		}
	}

