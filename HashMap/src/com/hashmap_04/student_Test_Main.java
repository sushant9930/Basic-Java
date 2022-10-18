package com.hashmap_04;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.hashmap_03.Supplier;
public class student_Test_Main {

	public static void main(String[] args) 
	{
		Test t1=new Test();
		t1.setT_name("Assignment");
		t1.setTest_given_date("20/10/2022");
		
		Test t2=new Test();
		t2.setT_name("Semister");
		t2.setTest_given_date("22/10/2022");
		
		Test t3=new Test();
		t3.setT_name("Final");
		t3.setTest_given_date("24/10/2022");
		
		ArrayList<Test> test=new ArrayList<Test>();
		test.add(t1);
		test.add(t2);
		test.add(t3);
		
		
		Student s1=new Student();
		s1.setS_id(121);
		s1.setS_name("Rahul Tripati");
		s1.setT(test);
		
		Student s2=new Student();
		s2.setS_id(122);
		s2.setS_name("Somnath Jadhav");
		s2.setT(test);
		
		Student s3=new Student();
		s3.setS_id(123);
		s3.setS_name("Pratik Pawshe");
		s3.setT(test);
		
		Student s4=new Student();
		s4.setS_id(124);
		s4.setS_name("Mahesh Patil");
		s4.setT(test);
		
		Student s5=new Student();
		s5.setS_id(125);
		s5.setS_name("Tushar Jadhav");
		s5.setT(test);
		
		HashMap<Integer,Student> hs_01=new HashMap<Integer,Student>();
		hs_01.put(1, s1);
		hs_01.put(2, s2);
		hs_01.put(3, s3);
		hs_01.put(4, s4);
		hs_01.put(5, s5);
		
		Set<Entry<Integer, Student>> set=hs_01.entrySet();
		Iterator<Entry<Integer, Student>> itr_01 = set.iterator();
		while(itr_01.hasNext()) 
		{
			
			Entry<Integer, Student> entry= itr_01.next();
			System.out.println(entry.getKey()+" "+ entry.getValue());
		}		
	}

}
