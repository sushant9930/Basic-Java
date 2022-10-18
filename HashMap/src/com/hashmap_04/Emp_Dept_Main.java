package com.hashmap_04;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;
public class Emp_Dept_Main {
	
	static void sumOfSalary(HashSet<Department> hs) 
	{
		Integer sum = 0;
		HashMap<String, ArrayList<Integer>> hs_01=
				new HashMap<String, ArrayList<Integer>>();
		Iterator<Department> itr=hs.iterator();
		while(itr.hasNext()) 
		{
			Department d=itr.next();
			if(hs_01.containsKey(d.getD_city())) 
			{
				ArrayList<Integer> al=hs_01.get(d.getD_city());
				Integer salary =d.e.getE_salary();	
				al.add(salary);
				String city = d.getD_city();
				hs_01.put(city, al);
			}
			else 
			{
				ArrayList<Integer> al=new ArrayList<Integer>();
				Integer salary = d.e.getE_salary();
				al.add(salary);
				String city =d.getD_city();
				hs_01.put(city, al);
			}
		}
	
		Set<Entry<String, ArrayList<Integer>>> set = hs_01.entrySet();
		for(Entry<String, ArrayList<Integer>> en : set) 
		{
			System.out.println(en.getKey());
			System.out.println(en.getValue());
		}
		
		Collection<ArrayList<Integer>> col = hs_01.values();
		for(ArrayList<Integer> i_01 : col) 
		{
			sum = sum + i_01.get(0);
			
		}
		
	}
	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		e1.setE_id(141);
		e1.setE_name("Sushant Mane");
		e1.setE_salary(10000);
		
		
		Employee e2=new Employee();
		e2.setE_id(142);
		e2.setE_name("Rahul Shelke");
		e2.setE_salary(15000);
		

		Employee e3=new Employee();
		e3.setE_id(143);
		e3.setE_name("Pramod Jedhe");
		e3.setE_salary(10100);
	
		
		Employee e4=new Employee();
		e4.setE_id(147);
		e4.setE_name("Rushikesh Patil");
		e4.setE_salary(20000);
	
		Employee e5=new Employee();
		e5.setE_id(146);
		e5.setE_name("Prashant Patil");
		e5.setE_salary(20500);
		
		Employee e6=new Employee();
		e6.setE_id(149);
		e6.setE_name("Shivan Shreewastav");
		e6.setE_salary(10000);
		
		Department d1=new Department();
		d1.setD_id(121);
		d1.setD_name("Production");
		d1.setD_city("Mumbai");
		d1.setE(e6);
		
		Department d2=new Department();
		d2.setD_id(122);
		d2.setD_name("Quality");
		d2.setD_city("Pune");
		d2.setE(e5);
		
		Department d3=new Department();
		d3.setD_id(123);
		d3.setD_name("Sales");
		d3.setD_city("Nagpur");
		d3.setE(e3);
		
		Department d4=new Department();
		d4.setD_id(121);
		d4.setD_name("Production");
		d4.setD_city("Mumbai");
		d4.setE(e2);
		
		Department d5=new Department();
		d5.setD_id(123);
		d5.setD_name("Sales");
		d5.setD_city("Nagpur");
		d5.setE(e1);
		
		Department d6=new Department();
		d6.setD_id(123);
		d6.setD_name("Sales");
		d6.setD_city("Nagpur");
		d6.setE(e4);
		
		
		HashMap<String,ArrayList<String>> hm = 
				new HashMap<String,ArrayList<String>>();
		
		HashSet<Department> hs = new HashSet<Department>();
		hs.add(d1);
		hs.add(d2);
		hs.add(d3);
		hs.add(d4);
		hs.add(d5);
		hs.add(d6);
		
/*
		Iterator<Department> itr=hs.iterator();
		while(itr.hasNext()) 
		{
			Department d=itr.next();
			if(hm.containsKey(d.getD_name())) 
			{
				ArrayList<String> al=hm.get(d.getD_name());
				String name=d.e.getE_name();
				al.add(name);
				String dname=d.getD_name();
				hm.put(dname, al);
			}
			else 
			{
				ArrayList<String> al=new ArrayList<String>();
				String name=d.e.getE_name();
				al.add(name);
				String dname=d.getD_name();
				hm.put(dname, al);
			}
		}
		
		Set<Entry<String, ArrayList<String>>> set = hm.entrySet();
		for(Entry<String, ArrayList<String>> en : set) 
		{
			System.out.println(en.getKey());
			System.out.println(en.getValue());
		}
		*/
		sumOfSalary(hs);
	
		
		
		
	}

}
