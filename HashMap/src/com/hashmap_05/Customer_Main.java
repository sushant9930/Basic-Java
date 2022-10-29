package com.hashmap_05;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Customer_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer c1=new Customer();c1.setC_id(1425);c1.setC_name("Rahul");c1.setD_of_account("2020-10-15");
		
		Customer c2=new Customer();c2.setC_id(1421);c2.setC_name("Ramesh");c2.setD_of_account("2019-01-10");
		
		Customer c3=new Customer();c3.setC_id(1427);c3.setC_name("Pratik");c3.setD_of_account("2021-09-25");
		
		Customer c4=new Customer();c4.setC_id(1405);c4.setC_name("Shital");c4.setD_of_account("2015-07-29");
		
		Customer c5=new Customer();c5.setC_id(1430);c5.setC_name("Ashok");c5.setD_of_account("2022-07-15");
		
		Customer c6=new Customer();c6.setC_id(1428);c6.setC_name("Ganga");c6.setD_of_account("2020-12-05");
		
		Queue<Customer> q=new LinkedList<Customer>();
		q.add(c6);
		q.add(c5);
		q.add(c4);
		q.add(c3);
		q.add(c2);
		q.add(c1);
				
		Iterator<Customer> itr=q.iterator();
		while(itr.hasNext()) 
		{
			Customer c=itr.next();
			System.out.println(c);			
		}
		
		System.out.println("\nQueue's head : "+q.poll());
		
		// for(Customer cc : q) 
		 //{ System.out.println(cc); }
		 

	}

}
