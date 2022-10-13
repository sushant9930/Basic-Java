package com.arraylist_01;

import java.util.ArrayList;
public class Example_02 {
	
	public static void main(String[] args) {
		
		ArrayList<String> s=new ArrayList<String>();
		
		s.add("sushant");
		s.add("nikita");
		s.add("dinkar");
		s.add("sangita");
		
		//by iterator
		System.out.println("Printing by iterator");
		System.out.println(s);
		System.out.println();
		
		//by for loop
		System.out.println("Printing by for loop");
		for(int i=0; i<s.size(); i++) 
		{
			System.out.print(s.get(i)+" ");
		}
		
		//by using enhanced loop
		System.out.println();
		System.out.println("\nby using enhanced");
		for(String ss:s) 
		{
			System.out.print(ss+" ");
		}
	}

}
