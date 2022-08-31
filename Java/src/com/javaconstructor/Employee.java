package com.javaconstructor;

import java.util.Scanner;

public class Employee {
	
	
	long id, salary;
	String name;
	
Employee()
{
	id=1;
	name=null;
	salary=000;
	
}

Employee(long a, String b, long c)
{
	id=a;
	name=b;
	salary=c;	
}
 
public String toString() 
{
	return("Employee name is...."+name+
			"\n"+"Emplyee Id No. is...."+id+
			"\n"+"Emplyee Salary is....."+salary+" Rs.");	
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
		
		
	   /* System.out.println();
		System.out.println("Enter 2nd Employee details:");
		System.out.println("Enter Id no.:");
		id=sc.nextLong();
		System.out.println("Enter Employee name:");
		name=sc.next();
		System.out.println("Enter Salary:");
		salary=sc.nextLong();*/
		
		System.out.println();
		System.out.println("Display default details:");
		Employee e1=new Employee();
		e1.display();
		
		System.out.println();
		System.out.println("Display 1st Employee details:");
		System.out.println();
		Employee e2=new Employee(id,name,salary);
	     System.out.println(e2);
		
	}

}
