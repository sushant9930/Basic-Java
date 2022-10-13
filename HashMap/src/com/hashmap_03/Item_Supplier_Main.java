package com.hashmap_03;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Item_Supplier_Main {
	
	static void priceWiseShow(HashMap<Supplier, Item> hs) 
	{
		Set<Entry<Supplier, Item>> set=hs.entrySet();
		for(Entry<Supplier, Item> map : set) 
		{
			if(map.getValue().getPrice() >100) 
			{
				System.out.println(map.getKey());
			}
		}
	}

	static void showNameWise(HashMap<Supplier, Item> hs) 
	{
		Set<Entry<Supplier, Item>> set=hs.entrySet();
		for(Entry<Supplier, Item> map : set) 
		{
			if(map.getKey().getS_name().equalsIgnoreCase("Shree Patil Store")) 
			{
				System.out.println(map.getKey());
				
			}
		}
	}
	
	
	public static void main(String[] args) 
	{
		Item i1=new Item();
		i1.setI_id(11);
		i1.setI_name("Sugar");
		i1.setPrice(20);
	
		
		Item i2=new Item();
		i2.setI_id(12);
		i2.setI_name("Salt");
		i2.setPrice(25);
		
		
		Item i3=new Item();
		i3.setI_id(13);
		i3.setI_name("Biryani Rice");
		i3.setPrice(140);
	
		
		Item i4=new Item();
		i4.setI_id(14);
		i4.setI_name("Basmati Rice");
		i4.setPrice(110);
		
		
		Item i5=new Item();
		i5.setI_id(15);
		i5.setI_name("Pulav Rice");
		i5.setPrice(110);
		
		
		Item i6=new Item();
		i6.setI_id(16);
		i6.setI_name(" Rice");
		i6.setPrice(110);
	
		
		
		Supplier s1=new Supplier();
		s1.setS_id(123);
		s1.setS_name("Shree Patil Store");
		s1.setLocation("Navi Mumbai");
		s1.setI(i1);
		
	
		
		
		Supplier s2=new Supplier();
		s2.setS_id(124);
		s2.setS_name("Ganesh Store");
		s2.setLocation("Mumbai");
		s2.setI(i2);
	
		
		
		Supplier s3=new Supplier();
		s3.setS_id(125);
		s3.setS_name("Shree Shankar Store");
		s3.setLocation("Pune");
		s3.setI(i3);
		
		
		
		Supplier s4=new Supplier(); 
		s4.setS_id(124); 
		s4.setS_name("Shree Ganesh Store");
		s4.setLocation("Mumbai");
		s4.setI(i4);
	
		
		Supplier s5=new Supplier(); 
		s5.setS_id(125); 
		s5.setS_name("Shree Shankar Store");
		s5.setLocation("Pune");
		s5.setI(i5);
		
		Supplier s6=new Supplier(); 
		s6.setS_id(125); 
		s6.setS_name("Shree Shankar Store");
		s6.setLocation("Pune");
		s6.setI(i6);
		
		HashMap<Supplier, Item> hs=new HashMap<Supplier, Item>();
		hs.put(s1, i1);
		hs.put(s5, i2);
		hs.put(s3, i3);
		hs.put(s4, i4);
		hs.put(s5, i5);
		hs.put(s6, i6);
		
		priceWiseShow(hs);
		System.out.println();
		showNameWise(hs);

	}

}
