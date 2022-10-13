package com.arraylist_01;

import java.util.ArrayList;

public class WithoutGenerics {

	public static void main(String[] args) {
		
		ArrayList a=new ArrayList();
		
		a.add("sushant");
		a.add(10);
		a.add(20);
		a.add(30.0f);
		a.add(null);
		a.add("mane");
		
		System.out.println(a);
		
		ArrayList b=new ArrayList();
		b.add("ramesh");
		b.add("rahul");
		b.add("rutik");
		
		System.out.println(b);
		
		ArrayList c=new ArrayList();
		c.add(10);
		c.add("sushant");
		System.out.println(c);
		
		
		

	}

}
