package com.arraylist_01;

import java.util.ArrayList;
public class ReplaceElement {

	public static void main(String[] args) {
		
		ArrayList<Integer> l=new ArrayList<Integer>();
		
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		
		System.out.println("Before replace");
		System.out.println(l);
		System.out.println();
		l.set(2, 100);
		System.out.println("After replace second index element with 100");
		System.out.println(l);
	
	}
}
