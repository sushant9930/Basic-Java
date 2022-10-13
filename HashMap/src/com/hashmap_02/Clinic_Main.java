package com.hashmap_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;



public class Clinic_Main {

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
			
		
		//HashMap<Clinic, Doctor> c=new HashMap<Clinic, Doctor>();
		TreeMap<Clinic, Doctor> c=new TreeMap<Clinic, Doctor>(new Rating_01());
		Clinic cc1=new Clinic();
		cc1.setC_id(120);
		cc1.setC_name("Shushrusha");
		cc1.setLocation("Mumbai");
		cc1.setRating(8);
		//cc1.setD(d1);
		
		
		
		Clinic cc2=new Clinic();
		cc2.setC_id(4230);
		cc2.setC_name("Shree Hospital");
		cc2.setLocation("Pune");
		cc2.setRating(7);
		//cc2.setD(d2);
		
		Clinic cc3=new Clinic();
		cc3.setC_id(42);
		cc3.setC_name("Icon");
		cc3.setLocation("Pune");
		cc3.setRating(6);
		//cc3.setD(d3);
		
		c.put(cc1, d1);
		c.put(cc2, d2);
		c.put(cc3, d3);

				for(Map.Entry<Clinic, Doctor> entry : c.entrySet()) 
				{
					System.out.println(entry.getKey()+ " " + entry.getValue());
				}
				System.out.println("-----------------------------");
					
				
				
				Set<Entry<Clinic, Doctor>> entry_01 = c.entrySet();
					for(Map.Entry<Clinic, Doctor> map : entry_01) 
					{
						Clinic c_01 = map.getKey();
						if(c_01.getC_name().equals("Icon")) 
						{
							System.out.println(map.getKey() +" "+map.getValue());
						}
					}
					
				
	}

}
