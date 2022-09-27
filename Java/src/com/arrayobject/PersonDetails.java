package com.arrayobject;

import java.util.Scanner;

public class PersonDetails {

	public static void main(String[] args)
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number of person:");
		int n=sc.nextInt();
		Person p[]=new Person[n];
		for(int i=0; i<p.length; i++) 
		{
			System.out.println("Enter person Employee id:");
			int pid=sc.nextInt();
			System.out.println("Enter person first name:");
			String firstname=sc.next();
			System.out.println("Enter person last name:");
			String lastname=sc.next();
			System.out.println("Enter contact number:");
			String contact=sc.next();
			
			System.out.println("Enter how many id proof this person carrying.");
			int n1=sc.nextInt();
			IdProof id1[]=new IdProof[n1];
			int j=0;
			for(; j<id1.length; j++) 
			{
				System.out.println("Enter id first name: ");
				String pfirstname=sc.next();
				System.out.println("Enter id last name: ");
				String plastname=sc.next();
				System.out.println("Enter id number:");
				long id=sc.nextLong();
				
				IdProof ip=new IdProof();
				ip.setId(id);
				ip.setPfirstname(pfirstname);
				ip.setPlastname(plastname);
				
				id1[j]=ip;
			}
			
			Person pp=new Person();
			pp.setPid(pid);
			pp.setFirstname(firstname);
			pp.setLastname(lastname);
			pp.setContact(contact);
			pp.setI(id1);
			
			p[i]=pp;
			
			if(p[i].getFirstname()==id1[j].getPfirstname() && p[i].getLastname()==id1[j].getPlastname()) 
			{
			System.out.println(p[i]+"\n");
			}
			
		}

	}

}
