package com.arraylist_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ItemMain {

	public static void main(String[] args) {
		Item i1=new Item(1,"machine",20000);
		Item i2=new Item(2,"tv",30000);
		Item i3=new Item(3,"mixer",5000);
		Item i4=new Item(4,"vivo",15000);
		Item i5=new Item(5,"ac",40000);
		
		ArrayList<Item> al=new ArrayList<Item>();
		al.add(i1);
		al.add(i2);
		al.add(i3);
		al.add(i4);
		al.add(i5);
		
		Iterator<Item>li=al.iterator();
		
		while(li.hasNext())
		{
			
			System.out.println(li.next());
		}
		
		
		Collections.sort(al, new Price());
		System.out.println("sorting on basis of price");
		Iterator<Item>li2=al.iterator();
		
		while(li2.hasNext())
		{
			System.out.println(li2.next());
		}
		
		Collections.sort(al, new Name_01());
		System.out.println("sorting on basis ofname");
		Iterator<Item>li3=al.iterator();
		
		while(li3.hasNext())
		{
			System.out.println(li3.next());
		}
		
		
		

	}

}
