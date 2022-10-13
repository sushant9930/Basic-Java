package com.arraylist_03;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class SuffleElements {

	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("Sushant");
		al.add("Mane");
		al.add("Nikita");
		al.add("Suraj");
		al.add("Shivraj");
		al.add("Shital");
		
		System.out.println("------Before shuffle-------");
		
		Iterator<String> id=al.iterator();
		while(id.hasNext()) 
		{
			System.out.print(id.next()+" ");
		}
		
		System.out.println("\n-----After shuffle------");
		Collections.shuffle(al);
		Iterator<String> id1=al.iterator();
		while(id1.hasNext()) 
		{
			System.out.print(id1.next()+" ");
		}
	}

}
