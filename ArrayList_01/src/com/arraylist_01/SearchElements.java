package com.arraylist_01;

import java.util.ArrayList;

public class SearchElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		
		System.out.println("ArrayList contains 30: "+a.contains(30));
		System.out.println("ArrayList contains 50: "+a.contains(50));
		
	}

}
