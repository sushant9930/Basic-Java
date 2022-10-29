package com.hashmap_05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Car_ArrayList_Main {
	
	static void remove(ArrayList<Car> al) 
	{
		Iterator<Car> itr=al.iterator();
		while(itr.hasNext()) 
		{
			Car c=itr.next();
			if(c.getC_name().equals("Toyoto")) 
			{
				itr.remove();
			}
		}
		
		System.out.println("\n------------Remove Toyoto car--------------");
		for(Car cc : al) 
		{
			System.out.println(cc);
		}
	}

	static void setMarutiPrice(ArrayList<Car> al) 
	{
		for(Car cc : al) 
		{
			if(cc.getC_id()==102) 
			{
				cc.setC_price(1000000);
			}
		}
		
		System.out.println("After set Maruti Price");
		for(Car cc : al) 
		{
			System.out.println(cc);
		}
	}
	
	static void sort_Price(ArrayList<Car> al) 
	{
		System.out.println("--------Sorting by Price--------");
		Collections.sort(al, new Car_Price_Sort());
		Iterator<Car> itr=al.iterator();
		while(itr.hasNext()) 
		{
			Car c=itr.next();
			System.out.println(c);
		}
		
	}
	
	static void greater_Price(ArrayList<Car> al) 
	{
		System.out.println("--------Car greater than 400000--------");
		Iterator<Car> itr =al.iterator();
		while(itr.hasNext()) 
		{
			Car c= itr.next();
			if(c.getC_price()>400000) 
			{
				System.out.println(c);
			}
		}
	}
	
	static void desc_Sort_Name(ArrayList<Car> al) 
	{
		System.out.println("--------Dsecending Sorting by Name--------");
		Collections.sort(al, new Car_Name_Sort());
		Iterator<Car> itr=al.iterator();
		while(itr.hasNext()) 
		{
			Car c=itr.next();
			System.out.println(c);
		}
		
	}
	
	static void sort_Rating(ArrayList<Car> al) 
	{
		System.out.println("--------Sorting by Rating--------");
		Collections.sort(al, new Car_Rating_Sort());
		Iterator<Car> itr=al.iterator();
		while(itr.hasNext()) 
		{
			Car c=itr.next();
			System.out.println(c);
		}
		
	}
	
	
	public static void main(String[] args) {
		
		Car c1=new Car();
		c1.setC_id(125);
		c1.setC_name("Tata Motors");
		c1.setC_price(250000);
		c1.setC_rating(4.5f);
		
		Car c2=new Car();
		c2.setC_id(124);
		c2.setC_name("Toyoto");
		c2.setC_price(200000);
		c2.setC_rating(3.5f);
		
		Car c3=new Car();
		c3.setC_id(126);
		c3.setC_name("Mahindra");
		c3.setC_price(350000);
		c3.setC_rating(5f);
		
		Car c4=new Car();
		c4.setC_id(129);
		c4.setC_name("Hyundai");
		c4.setC_price(100000);
		c4.setC_rating(4f);
		
		Car c5=new Car();
		c5.setC_id(127);
		c5.setC_name("Mercedes");
		c5.setC_price(390000);
		c5.setC_rating(6.5f);
		
		Car c6=new Car();
		c6.setC_id(128);
		c6.setC_name("Scoda");
		c6.setC_price(258000);
		c6.setC_rating(7.5f);
		
		ArrayList<Car> al=new ArrayList<Car>();
		al.add(c1);
		al.add(c2);
		al.add(c3);
		al.add(c4);
		al.add(c5);
		al.add(c6);
		
		
		Car c7=new Car();
		c7.setC_id(102);
		c7.setC_name("Maruti");
		c7.setC_rating(3f);
		
		al.set(3, c7);
		
		Iterator<Car> itr = al.iterator();
		while(itr.hasNext()) 
		{
			Car c=itr.next();
			System.out.println(c);
		}
	
		
		remove(al);
		setMarutiPrice(al);
		sort_Price(al);
		sort_Rating(al);
		desc_Sort_Name(al);
		greater_Price(al);
		}

}
