package com.javamethods;

import java.util.Scanner;

public class EmployeeSalary 
{
	long id;
	String name, dept;                     //globle variable
	char grade;
	float salary;
	
	void setData(String a, String b, long c, float d, char e) 
	{
		name=a;
		dept=b;
		id=c;
		salary=d;	
		grade=e;}
	
	void bonus() 
	{
		
		if (grade=='A') 
		{
			salary=salary+(salary*0.2f);	
			System.out.println("Employee Incremented salary is: "+salary);
		}
		else if (grade=='B') 
		{
			salary=salary+(salary*0.15f);	
			System.out.println("Employee Incremented salary is: "+salary);
		}
		else if (grade=='C') 
		{
			salary=salary+(salary*0.10f);		
			System.out.println("Employee Incremented salary is: "+salary);
		}
		else 
		{
			System.out.println("No Increment in salary do your best for next....!" );
		}
		
	}
	
	void display()
	{
		System.out.println("Employee Name is: "+name);
		System.out.println("Employee Department is: "+dept);
		System.out.println("Employee Id No.is: "+id);
		System.out.println("Employee current Salary is: "+salary);
		System.out.println("Emplyee Grade is: "+grade);
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		EmployeeSalary e1=new EmployeeSalary();
		
		System.out.println();
		System.out.println("1st Employee details: ");
		System.out.println("Enter Employee name:");
		String name=sc.next();
		System.out.println("Enter Employee Department:");
		String dept=sc.next();
		System.out.println("Enter Employee Id No.:");
		long id=sc.nextLong();
		System.out.println("Enter Employees current salary:");
		float salary=sc.nextFloat();
		System.out.println("Please mention Employee grade here: ");
		char grade=sc.next().charAt(0);
		e1.setData(name, dept, id, salary, grade);
		
		
		EmployeeSalary e2=new EmployeeSalary();
		System.out.println();
		System.out.println("2nd Employee details: ");
		System.out.println("Enter Employee name:");
		name=sc.next();
		System.out.println("Enter Employee Department:");
		dept=sc.next();
		System.out.println("Enter Employee Id No.:");
		id=sc.nextLong();
		System.out.println("Enter Employees current salary:");
		salary=sc.nextLong();
		System.out.println("Please mention Employee grade here: ");
		grade=sc.next().charAt(0);
		e2.setData(name, dept, id, salary, grade);

		System.out.println("1st Employee Details:");
		
		e1.display();
		e1.bonus();
		System.out.println();
		
	    System.out.println("2nd Employee Details:");
		
		e2.display();
		e2.bonus();
		System.out.println();
		
		
		
		
	}

}
