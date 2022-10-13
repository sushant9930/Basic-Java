package com.arraylist_03;
import java.util.*;
public class ExtractArrayList {
	
	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		list.add("Sushant");
		list.add("Mane");
		list.add("Nikita");
		list.add("Suraj");
		list.add("Shivraj");
		list.add("Shital");
		
		System.out.println("------Before Extract--------");
		Iterator<String> id=list.iterator();
		while(id.hasNext()) 
		{
			System.out.print(id.next()+" ");
		}
		
		System.out.println("\n------After Extract-----");
		List<String> sub_List=list.subList(0, 3);
		System.out.println("List of first three elements: "+sub_List);
	}

}
