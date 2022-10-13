package com.arraylist_03;
import java.util.*;
public class Sorting {

	public static void main(String[] args) 
	{
		LinkedList<String> al=new LinkedList<>();

		al.add("Sushant");
		al.add("Nikita");
		al.add("Rakesh");
		al.add("Dinkar");
		al.add("zoya");
		
		System.out.println("-------Unsorted ArrayList--------");
		Iterator<String> id=al.iterator();
		while(id.hasNext()) 
		{
			System.out.println(id.next());
		}
		
		System.out.println("-----------Sorted ArrayList----------");
		String o[]=new String[al.size()];
		String in[]=al.toArray(o);
		
		for(int i=0; i<in.length; i++) 
		{
			for(int j=i+1; j<in.length; j++ ) 
			{
				if((in[i]).compareTo(in[j]) > 0) 
				{
				String temp=(String) in[i];
				in[i]=in[j];
				in[j]=temp;
			
				}
			}
		}
		
		
		System.out.println(Arrays.toString(in));
		
		
	}

}
