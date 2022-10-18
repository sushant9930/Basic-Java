package com.hashmap_03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class Supplier_Item {

	public static void main(String[] args) 
	{
		
		Item i1=new Item();
		i1.setI_id(11);i1.setI_name("Sugar");i1.setPrice(20);
	
		Item i2=new Item();
		i2.setI_id(12);i2.setI_name("Salt");i2.setPrice(25);
		
		Item i3=new Item();
		i3.setI_id(13);i3.setI_name("Biryani Rice");i3.setPrice(140);
		
		Item i4=new Item();
		i4.setI_id(14);i4.setI_name("Basmati Rice");i4.setPrice(110);
		
		Item i5=new Item();
		i5.setI_id(15);i5.setI_id(12);i5.setI_name("Shabudana");
		
		Item i6=new Item();
		i6.setI_id(16);i6.setI_name("Brown Rice");i6.setPrice(120);
	
		
		
		Supplier s1=new Supplier();
		s1.setS_id(123);s1.setS_name("Shree Patil Store");s1.setLocation("Navi Mumbai");s1.setI(i1);
		
		Supplier s2=new Supplier();
		s2.setS_id(124);s2.setS_name("Shree Ganesh Store");s2.setLocation("Mumbai");s2.setI(i2);		
		
		Supplier s3=new Supplier();
		s3.setS_id(125);s3.setS_name("Shree Shankar Store");s3.setLocation("Pune");s3.setI(i3);		
		
		Supplier s4=new Supplier(); 
		s4.setS_id(124); s4.setS_name("Shree Ganesh Store");s4.setLocation("Mumbai");s4.setI(i4);	
		
		Supplier s5=new Supplier(); 
		s5.setS_id(125); s5.setS_name("Shree Shankar Store");s5.setLocation("Pune");s5.setI(i5);
		
		Supplier s6=new Supplier(); 
		s6.setS_id(125); s6.setS_name("Shree Shankar Store");s6.setLocation("Pune");s6.setI(i6);
	
		
		HashMap<String, ArrayList<String>> hs=new HashMap<String, ArrayList<String>>();
		
		HashSet<Supplier> hs_01 =new HashSet<Supplier>();
		hs_01.add(s1);
		hs_01.add(s2);
		hs_01.add(s3);
		hs_01.add(s4);
		hs_01.add(s5);
		hs_01.add(s6);
		
		
		Iterator<Supplier> itr=hs_01.iterator();
		while(itr.hasNext()) 
		{
			
			Supplier s=itr.next();
			if(hs.containsKey(s.getS_name())) 			
			{
				ArrayList<String> al=hs.get(s.getS_name());
				String name=s.i.getI_name();
				al.add(name);
				String cname=s.getS_name();
				hs.put(cname, al);
			}
			else 
			{
				ArrayList<String> al=new ArrayList<String>();
				String name=s.i.getI_name();
				al.add(name);
				String cname=s.getS_name();
				hs.put(cname, al);
			}
		}
		
		Set<Entry<String, ArrayList<String>>> set = hs.entrySet();
		for(Entry<String, ArrayList<String>> en : set) 
		{
			System.out.println(en.getKey());
			System.out.println(en.getValue());
		}
		
		
	}

}
