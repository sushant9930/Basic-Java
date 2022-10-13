package com.arraylist_03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ReverseInArrayList {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
	
		al.add("Sushant");
		al.add("Mane");
		al.add("Nikita");
		al.add("Suraj");
		al.add("Shivraj");
		al.add("Shital");
		
		System.out.println("------Before Reverse-------");
		
		Iterator<String> id=al.iterator();
		while(id.hasNext()) 
		{
			System.out.print(id.next()+" ");
		}
		
		System.out.println("\n-------After Reverse-------");
		Collections.reverse(al);
		
		Iterator<String> id2=al.iterator();
		while(id2.hasNext()) 
		{
			System.out.print(id2.next()+" ");
		}

	}

}
