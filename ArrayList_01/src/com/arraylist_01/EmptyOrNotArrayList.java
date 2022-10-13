package com.arraylist_01;

import java.util.ArrayList;

public class EmptyOrNotArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		
		ArrayList<Integer> b=new ArrayList<Integer>();
		
		System.out.println("ArrayList a is Empty: "+a.isEmpty());
		System.out.println("ArrayList b is Empty: "+b.isEmpty());

	}

}
