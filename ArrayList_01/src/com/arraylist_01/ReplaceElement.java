package com.arraylist_01;

import java.util.ArrayList;
public class ReplaceElement {

	public static void main(String[] args) {
		
		ArrayList<String> l=new ArrayList<String>();
		
		l.add("sushant");
		l.add("mane");
		l.add("rahul");
		l.add("akshay");
		l.add("pratik");
		
		System.out.println("Before replace");
		System.out.println(l);
		System.out.println();
		l.set(2, "sonu");
		System.out.println("After replace second index element with 100");
		System.out.println(l);
	
	}
}
