package com.hashmap_04;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
public class SeparateDigitChar {

	public static void main(String[] args) 
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("A+2");
		list.add("B+12");
		list.add("D+4");
		list.add("DD+5");
		
		LinkedHashMap<String, String > hs=new LinkedHashMap<String, String>();
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) 
		{
			String s= itr.next();
			String [] arr = s.split("\\+");
			for(int i=0; i<arr.length-1; i++) 
			{
				String a=arr[i];
				String b=arr[i+1];
				hs.put(a, b);
			}
		}
		System.out.println(hs);
		
	}

}
