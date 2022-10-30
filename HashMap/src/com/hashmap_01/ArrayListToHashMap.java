package com.hashmap_01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashMap;

public class ArrayListToHashMap {

	static HashMap<String, Integer> convertArrayToHashMap(ArrayList<String> al, ArrayList<Integer>al1)
	{
		HashMap<String, Integer> hs=new HashMap<>();
		Iterator<String> itr=al.iterator();
		while(itr.hasNext()) 
		{
			String s =itr.next();
			Iterator<Integer> itr_01=al1.iterator();
				}
		return hs;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		al.add("pune");
		al.add("mumbai");
		al.add("pune");
		al.add("mumbai");
		al.add("nashik");
		al.add("pune");
		
		ArrayList<Integer> al1=new ArrayList<Integer>();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(40);
		al1.add(50);
		al1.add(60);
		
		HashMap<String, Integer> hs_01=convertArrayToHashMap(al,al1);
		Set<Entry<String, Integer>> set=hs_01.entrySet();
		Iterator<Entry<String, Integer>> itr=set.iterator();
		while(itr.hasNext()) 
		{
			String s =itr.next().getKey();
			Integer i= itr.next().getValue();
			System.out.println(s+" "+i);
		}
		

	}

}
