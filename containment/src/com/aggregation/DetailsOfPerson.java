package com.aggregation;

public class DetailsOfPerson {

	public static void main(String[] args) 
	{
		
		Address add[]=new Address[2];
		
		Address a1=new Address();
		Address a2=new Address();
		for(int i=0; i<add.length; i++) 
		{			
		
		a1.setCity("Mumbai");
		a1.setCountry("India");
		a1.setStreet("Govandi station road");
		a1.setState("Maharashtra");

		
		a2.setCity("Pune");
		a2.setCountry("India");
		a2.setStreet("Tower Line");
		a2.setState("Maharashtra");
		
		add[0]=a1;
		add[1]=a2;
		}
		
		Person per[]=new Person[2];
		Person p=new Person();
		Person p1=new Person();
		for(int i=0; i<per.length; i++) 
		{
		
		p.setName("Sushant Mane");
		p.setId(120);
		p.setAge(27);
		p.setContact(9607548980L);
		p.setA(a1);
		
		
		p1.setName("Suraj Mane");
		p1.setId(121);
		p1.setAge(30);
		p1.setContact(9368465165L);
		p1.setA(a2);
		
		per[0]=p;
		per[1]=p1;
		}
		
		System.out.println(p);
		System.out.println(p1);
	}

}
