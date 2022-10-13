package com.arraylist_03;
import java.util.*;


public class ClinicMain {
	
	static void sortRating(ArrayList<Clinic> li) 
	{
		System.out.println("------Sorting by Rating-----");
		Collections.sort(li, new Rating_01());
		Iterator <Clinic> id=li.iterator();
		while(id.hasNext()) 
		{
			System.out.print(id.next()+" ");
		}
		System.out.println();
	}
	
	static void sortLocation(ArrayList<Clinic> li) 
	{
		System.out.println("\n------Sort by Location------");
		Collections.sort(li, new Location_01());
		Iterator<Clinic> id=li.iterator();
		while(id.hasNext()) 
		{
			System.out.print(id.next()+" ");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doctor d1=new Doctor();
		d1.setD_id(456);
		d1.setD_name("Rahul Singh");
		
		Doctor d2=new Doctor();
		d2.setD_id(457);
		d2.setD_name("Pratik Potekar");
		
		Doctor d3=new Doctor();
		d3.setD_id(789);
		d3.setD_name("Ramesh kotkar");
			
		
		ArrayList<Clinic> c=new ArrayList<Clinic>();
		Clinic cc1=new Clinic();
		cc1.setC_id(120);
		cc1.setC_name("Shushrusha");
		cc1.setLocation("Mumbai");
		cc1.setRating(8);
		cc1.setD(d1);
		
		
		
		Clinic cc2=new Clinic();
		cc2.setC_id(4230);
		cc2.setC_name("Shree Hospital");
		cc2.setLocation("Pune");
		cc2.setRating(7);
		cc2.setD(d2);
		
		Clinic cc3=new Clinic();
		cc3.setC_id(42);
		cc3.setC_name("Icon");
		cc3.setLocation("Pune");
		cc3.setRating(6);
		cc3.setD(d3);
		
		c.add(cc1);
		c.add(cc2);
		c.add(cc3);
		
		
		sortRating(c);
		sortLocation(c);
		
		
	
	}

}
