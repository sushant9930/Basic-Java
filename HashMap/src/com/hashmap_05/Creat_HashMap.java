package com.hashmap_05;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

import com.hashmap_05.Car;
public class Creat_HashMap 
{
	static HashMap<String, Float> creat_HashMap(ArrayList<Car> al)
	{
		HashMap<String, Float> hm=new HashMap<String, Float>();
		Object o[]=al.toArray();
		for(int i=0; i<o.length; i++) 
		{
			hm.put(al.get(i).getC_name(), al.get(i).getC_rating());
		}
		return hm;	
	}
	
	static void sortingRating(HashMap<String, Float> hm) 
	{
		TreeMap<String, Float> tm=new TreeMap<String, Float>();
		
	}
	public static void main(String[] args) {
		
		Car c1=new Car();
		c1.setC_id(125);
		c1.setC_name("Tata Motors");
		c1.setC_price(2500000);
		c1.setC_rating(4.5f);
		
		Car c2=new Car();
		c2.setC_id(124);
		c2.setC_name("Toyoto");
		c2.setC_price(2000000);
		c2.setC_rating(3.5f);
		
		Car c3=new Car();
		c3.setC_id(126);
		c3.setC_name("Mahindra");
		c3.setC_price(3500000);
		c3.setC_rating(5f);
		
		Car c4=new Car();
		c4.setC_id(129);
		c4.setC_name("Hyundai");
		c4.setC_price(1000000);
		c4.setC_rating(4f);
		
		Car c5=new Car();
		c5.setC_id(127);
		c5.setC_name("Mercedes");
		c5.setC_price(3900000);
		c5.setC_rating(6.5f);
		
		Car c6=new Car();
		c6.setC_id(128);
		c6.setC_name("Scoda");
		c6.setC_price(2580000);
		c6.setC_rating(7.5f);
		
		ArrayList<Car> al=new ArrayList<Car>();
		al.add(c1);
		al.add(c2);
		al.add(c3);
		al.add(c4);
		al.add(c5);
		al.add(c6);
	
	
	
	HashMap<String, Float> hm=creat_HashMap(al);;	
	
	Set<Entry<String, Float>> set=hm.entrySet();
	for(Entry<String,Float> ss : set) 
	{
		System.out.println(ss.getKey()+" "+ss.getValue());
	}
	
	//SortedMap<String, Float> tm=new TreeMap<String, Float>();
	
	}
}