package com.arraylist_01;

import java.util.ArrayList;

public class SizeOfArrayList {

	public static void main(String[] args) 
	{
		ArrayList<Integer> a=new ArrayList<Integer>();
		
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(70);
		a.add(60);
		
		System.out.println(a);
		System.out.println("\nSize of ArrayList: "+a.size());
		System.out.println("ArrayList contains "+a.size()+" Elements.");

	}

}
