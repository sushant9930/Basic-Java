package com.javamethods;

import java.util.Scanner;

public class Employee {
	
	int id,salary;
	long contact;
	String name,dept;
	
	void setData(String a,int b,String c, long d,int e ) 
	{
		name=a;
		id=b;
		dept=c;
		contact=d;
		salary=e;
		
	}
	void display() 
	{
		System.out.println("Name:"+name);
		System.out.println("Id No.:"+id);
		System.out.println("Department:"+dept);
		System.out.println("Contact:"+contact);
		System.out.println("Salary:"+salary);
		System.out.println();
		
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Employee e=new Employee();
		
		System.out.println("Mention employee details here:");
		System.out.println("Enter name:");
		String name=sc.next();
		System.out.println("Enter Id No.:");
		int id=sc.nextInt();
		System.out.println("Enter Department:");
		String dept=sc.next();
		System.out.println("Enter Contact details:");
		long contact =sc.nextLong()	;	
	    System.out.println("Enter Salary details:");
		int salary=sc.nextInt();
		e.setData(name, id, dept, contact, salary);
	
		Employee e1=new Employee();
		System.out.println("Mention employee details here:");
		System.out.println("Enter name:");
		name=sc.next();
		System.out.println("Enter Id No.:");
		id=sc.nextInt();
		System.out.println("Enter Department:");
		dept=sc.next();
		System.out.println("Enter Contact details:");
	    contact =sc.nextInt();
		System.out.println("Enter Salary details:");
	    salary=sc.nextInt();
	    e1.setData(name, id, dept, contact, salary);

		Employee e2=new Employee();
		System.out.println("Mention employee details here:");
		System.out.println("Enter name:");
		name=sc.next();
		System.out.println("Enter Id No.:");
		id=sc.nextInt();
		System.out.println("Enter Department:");
		dept=sc.next();
		System.out.println("Enter Contact details:");
		contact =sc.nextInt();
		System.out.println("Enter Salary details:");
		salary=sc.nextInt();
		e2.setData(name, id, dept, contact, salary);
	
		Employee e3=new Employee();
		System.out.println("Mention employee details here:");
		System.out.println("Enter name:");
		name=sc.next();
		System.out.println("Enter Id No.:");
		id=sc.nextInt();
		System.out.println("Enter Department:");
		dept=sc.next();
		System.out.println("Enter Contact details:");
		contact =sc.nextInt();
		System.out.println("Enter Salary details:");
		salary=sc.nextInt();
		e3.setData(name, id, dept, contact, salary);

		Employee e4=new Employee();
		System.out.println("Mention employee details here:");
		System.out.println("Enter name:");
		name=sc.next();
		System.out.println("Enter Id No.:");
		id=sc.nextInt();
		System.out.println("Enter Department:");
		dept=sc.next();
		System.out.println("Enter Contact details:");
		contact =sc.nextInt();
		System.out.println("Enter Salary details:");
		salary=sc.nextInt();
		e4.setData(name, id, dept, contact, salary);

		e.display();
		System.out.println();
		e1.display();
		System.out.println();
		e2.display();
		System.out.println();
		e3.display();
		System.out.println();
		e4.display();
		
	}

}
