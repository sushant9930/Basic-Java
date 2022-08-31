package com.javaconstructor;

import java.util.Scanner;

public class Demo {
	
	long id, salary;
	String name;
Demo(long a, String b, long c)
{
	id=a;
	name=b;
	salary=c;	
}
Demo()
{
	
}
void display() 
{
	System.out.println("Employee name is...."+name);
	System.out.println("Emplyee Id No. is...."+id);
	System.out.println("Emplyee Salary is....."+salary+" Rs.");
}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st Employee details:");
		System.out.println("Enter Id no.:");
		long id=sc.nextLong();
		System.out.println("Enter Employee name:");
		String name=sc.next();
		System.out.println("Enter Salary:");
		long salary=sc.nextLong();		
		Demo d1=new Demo(id,name,salary);
		System.out.println();
		System.out.println("Display 1st Employee details:");
		
		Demo d2=new Demo();
		d2.id=d1.id;
		d2.name=d1.name;
		d2.salary=d1.salary;		
		System.out.println();
		d1.display();
		System.out.println();
		d2.display();
	}

}
	
	
	
	
	

