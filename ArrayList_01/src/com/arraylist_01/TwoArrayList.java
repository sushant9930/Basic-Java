package com.arraylist_01;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class TwoArrayList {

	public static void main(String[] args) 
	{
		ArrayList <String> al=new ArrayList<String>();
		al.add("sun");
		al.add("mon");
		al.add("sun");
		al.add("tue");
		al.add("wed");
		al.add("mon");
		
		System.out.println(al);
		
		LinkedHashSet<String> hs=new LinkedHashSet<String>(al);
		//System.out.println("With linked has set: "+hs);
		
		ArrayList<String> al2=new ArrayList<String>(hs);
		System.out.println(al2);
		

	}

}
