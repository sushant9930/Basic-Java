package com.arraylist_01;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.text.html.HTMLDocument.Iterator;
public class EmployeeArrayList {

	public static void main(String[] args) {
		
		Employee e=new Employee();
		e.setId(120);
		e.setName("Sushant Mane");
		e.setSalary(210000);
		
		Employee e1=new Employee();
		e1.setId(125);
		e1.setName("Pratik Potekar");
		e1.setSalary(100000);
		
		Employee e2=new Employee();
		e2.setId(130);
		e2.setName("Suraj Gole");
		e2.setSalary(250000);
		
		Employee e3=new Employee();
		e3.setId(109);
		e3.setName("Vikram Nanavre");
		e3.setSalary(150000);
		
		Employee e4=new Employee();
		e4.setId(121);
		e4.setName("Rahul Ukirde");
		e4.setSalary(200000);
		
		Employee e5=new Employee();
		e4.setId(129);
		e4.setName("Prathamesh Gosavi");
		e4.setSalary(200000);
		
		ArrayList<Employee> ee=new ArrayList<Employee>();
		ee.add(e);
		ee.add(e1);
		ee.add(e2);
		ee.add(e3);
		ee.add(e4);
		ee.add(e5);
		
		//System.out.println(ee);
		
		/*for(int i=0; i<ee.size(); i++) 
		{
			System.out.println(ee.get(i));
		}*/
		Collections.sort(ee);

		//System.out.println(ee);
	}

}
