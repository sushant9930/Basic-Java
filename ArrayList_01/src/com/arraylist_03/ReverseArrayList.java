package com.arraylist_03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ReverseArrayList {

	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		
		ListIterator<Integer> li=al.listIterator();
		while(li.hasPrevious()) 
		{
			li.previous();
			System.out.println(li.next());
		}

		Iterator itr=al.iterator();
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
	}

}
