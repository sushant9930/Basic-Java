package com.arraylist_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;



public class MainSorting {

	public static void main(String[] args) 
	{
		ArrayList<Movies> m=new ArrayList<Movies>();
		
		Movies m1=new Movies(121, 2500000, "Bahubali", 4.5f);
		Movies m2=new Movies(122, 2000000, "RRR", 4f);
		Movies m3=new Movies(123, 1000000, "Veer", 3f);
		Movies m4=new Movies(125, 3000000, "Singham", 5f);
		Movies m5=new Movies(124, 2500000, "Cutputli", 3.5f);
		
		m.add(m1);
		m.add(m2);
		m.add(m3);
		m.add(m4);
		m.add(m5);
		
		Iterator<Movies> id1=m.iterator();
		while(id1.hasNext()) 
		{
			System.out.println(id1.next());
		}
		
		System.out.println("---------Sorting by name----------");
		Collections.sort(m);
		Iterator<Movies> id=m.iterator();
		while(id.hasNext()) 
		{
			System.out.println(id.next());
		}
		

	}

}
