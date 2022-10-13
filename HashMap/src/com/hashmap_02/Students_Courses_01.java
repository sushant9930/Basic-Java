package com.hashmap_02;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
public class Students_Courses_01 {

	public static void main(String[] args) 
	{
		Studets_01 s=new Studets_01();
		s.setRoll(1120);
		s.setS_name("Sushant Mane");
		
		Studets_01 s1=new Studets_01();
		s1.setRoll(1121);
		s1.setS_name("Pratik Potekar");
		
		Studets_01 s2=new Studets_01();
		s2.setRoll(1122);
		s2.setS_name("Satish Kamble");
		
		Studets_01 s3=new Studets_01();
		s3.setRoll(1123);
		s3.setS_name("Rani Kale");
		
		Studets_01 s4=new Studets_01();
		s4.setRoll(1129);
		s4.setS_name("Rahul Patil");
		
		Studets_01 s5=new Studets_01();
		s5.setRoll(1125);
		s5.setS_name("Rene Rane");
		
		Studets_01 s6=new Studets_01();
		s6.setRoll(1130);
		s6.setS_name("Suraj Bhor");
		

		Courses_01 c1=new Courses_01();
		c1.setC_id(121);
		c1.setC_name("Java");
		c1.setC_fees(15000);
		c1.setS(s);
		
		Courses_01 c2=new Courses_01();
		c2.setC_id(122);
		c2.setC_name("C");
		c2.setC_fees(25000);
		c2.setS(s1);
		
		Courses_01 c3=new Courses_01();
		c3.setC_id(123);
		c3.setC_name("C#");
		c3.setC_fees(20000);
		c3.setS(s3);
		
		Courses_01 c4=new Courses_01();
		c4.setC_id(124);
		c4.setC_name("Pythan");
		c4.setC_fees(35000);
		c4.setS(s4);
		
		Courses_01 c5=new Courses_01();
		c5.setC_id(121);
		c5.setC_name("Java");
		c5.setC_fees(15000);
		c5.setS(s5);
		
		Courses_01 c6=new Courses_01();
		c6.setC_id(122);
		c6.setC_name("Java");
		c6.setC_fees(15000);
		c6.setS(s6);
		
		HashMap<String, ArrayList<String>> hs=new HashMap<String, ArrayList<String>>();
		
		HashSet<Courses_01> h=new HashSet<Courses_01>();
		h.add(c1);
		h.add(c2);
		h.add(c3);
		h.add(c4);
		h.add(c5);
		h.add(c6);
		
		Iterator <Courses_01> itr = h.iterator();
		while(itr.hasNext()) 
		{
			Courses_01 c =itr.next();
			if(hs.containsKey(c.getC_name())) 
			{
				ArrayList<String> al=hs.get(c.getC_name());
				String name=c.s.getS_name();
				al.add(name);
				hs.put(c.getC_name(), al);
			}
			else 
			{
				ArrayList<String> al=new ArrayList<String>();
				String name=c.s.getS_name();
				al.add(name);
				String cname=c.getC_name();
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
