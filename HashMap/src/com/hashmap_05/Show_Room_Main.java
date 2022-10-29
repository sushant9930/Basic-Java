package com.hashmap_05;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.hashmap_05.*;
public class Show_Room_Main {

	public static void main(String[] args) 
	{
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
		
		Show_Room sr1=new Show_Room();
		sr1.setS_name("Rajesh Motors");
		sr1.setS_location("Govandi");
		sr1.setC(c1);
		
		Show_Room sr2=new Show_Room();
		sr2.setS_name("Sita Ram Motors");
		sr2.setS_location("Chembur");
		sr2.setC(c2);
		
		Show_Room sr3=new Show_Room();
		sr3.setS_name("Axel Motors");
		sr3.setS_location("City Mall");
		sr3.setC(c3);
		
		Show_Room sr4=new Show_Room();
		sr4.setS_name("Vasan Motors");
		sr4.setS_location("Sion");
		sr4.setC(c4);
		
		Show_Room sr5=new Show_Room();
		sr5.setS_name("Vasan Motors");
		sr5.setS_location("Sion");
		sr5.setC(c5);
		
		Show_Room sr6=new Show_Room();
		sr6.setS_name("Axel Motors");
		sr6.setS_location("City Mall");
		sr6.setC(c6);
		
		Show_Room sr7=new Show_Room();
		sr7.setS_name("Axel Motors");
		sr7.setS_location("City Mall");
		sr7.setC(c1);
		
		
		HashMap<String, HashMap<String, String>> hm=new HashMap<String, HashMap<String,String>>();
		HashSet<Show_Room> hs=new HashSet<Show_Room>();
		hs.add(sr1);
		hs.add(sr2);
		hs.add(sr3);
		hs.add(sr4);
		hs.add(sr5);
		hs.add(sr6);
		hs.add(sr7);
		
		Iterator<Show_Room> itr=hs.iterator();
		while(itr.hasNext()) 
		{
			Show_Room  s=itr.next();
			if(hm.containsKey(s.getS_name())) 
			{
				HashMap<String, String> hm_01=hm.get(s.getS_name());
				String s1=s.getS_location();
				String s2=s.c.getC_name();
				hm_01.put(s1, s2);
				String s3=s.getS_name();
				hm.put(s3, hm_01);
				//System.out.println(hm_01);
			}
			else 
			{
				HashMap<String,String> hm_01=new HashMap<String,String>();
				String s1 =s.getS_location();
				String s2 = s.c.getC_name();
				hm_01.put(s1, s2);
				String s3 = s.getS_name();
				hm.put(s3, hm_01);
			}
		}
		Set<Entry<String, HashMap<String, String>>> st=hm.entrySet();
		for(Entry<String, HashMap<String,String>> en : st) 
		{
			System.out.println(en.getKey());
			System.out.println(en.getValue());
		}
		
	}

}
