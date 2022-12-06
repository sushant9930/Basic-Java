package com.hashmap_06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Supplier_Item {

	public static void main(String[] args) {
	
		Item s1=new Item();
		s1.setI_name("Rice");
		s1.setPrice(120);
		
		Item s2=new Item();
		s2.setI_name("Shabudana");
		s2.setPrice(60);
		
		Item s3=new Item();
		s3.setI_name("Mugh Dal");
		s3.setPrice(50);
		
		Item s4=new Item();
		s4.setI_name("Tur Dal");
		s4.setPrice(40);
		
		Supplier i1=new Supplier();
		i1.setS_id(101);
		i1.setS_name("Shree Ganesh Store");
		i1.setI(s1);
		
		Supplier i2=new Supplier();
		i2.setS_id(101);
		i2.setS_name("Shree Ganesh Store");
		i2.setI(s2);
		
		Supplier i3=new Supplier();
		i3.setS_id(101);
		i3.setS_name("Royal Store");
		i3.setI(s4);
		
		Supplier i4=new Supplier();
		i4.setS_id(101);
		i4.setS_name("InstaMart Store");
		i4.setI(s3);
		
		HashMap<String, ArrayList<String>> hm=new HashMap<String, ArrayList<String>>();
		
		HashSet<Supplier> hs=new HashSet<Supplier>();
		hs.add(i1);
		hs.add(i2);
		hs.add(i3);
		hs.add(i4);
		
		Iterator<Supplier> itr=hs.iterator();
		while(itr.hasNext()) 
		{
			Supplier s=itr.next();
			if(hm.containsKey(s.getS_name()))
			{
				
				ArrayList<String> al=hm.get(s.getS_name());
				String s11=s.i.getI_name();
				al.add(s11);
				
				
				String s12=s.getS_name();
				hm.put(s12, al);				
			}
			else 
			{
				ArrayList<String> al=new ArrayList<String>();
				String s11=s.i.getI_name();
				al.add(s11);
				
				String s12=s.getS_name();
				hm.put(s12, al);
			}
		}
		
		Set<Entry<String, ArrayList<String>>> set=hm.entrySet();
		for(Entry<String, ArrayList<String>> s : set) 
		{
			System.out.println(s.getKey());
			System.out.println(s.getValue());
		}
	}

}
