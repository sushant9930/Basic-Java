package com.arrayobject;

import java.util.*;
public class EmployeeDetails {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter count of Employees: ");
		int size=sc.nextInt();
		Employee emp[]=new Employee[size];
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter Employee details:");
			System.out.println("Id no.: ");
			int id=sc.nextInt();
			System.out.println("Employee name: ");
			String name=sc.next();
			System.out.println("Department name: ");
			String dept=sc.next();
			System.out.println("Salary: ");
			int salary=sc.nextInt();
		
			//Employee e=new Employee(id,name,dept,salary);
			emp[i]=new Employee(id,name,dept,salary);}
//		    System.out.println(Arrays.toString(emp));
//		    System.out.println(emp);
		    
		    for(Employee e:emp) 
		    {
		    	if(e.dept.equalsIgnoreCase("hr")) 
		    	{
		    		System.out.println(e);
		    	}
		    	System.out.println();
		    	if(e.salary>60000) 
		    	{
		    		System.out.println(e.name+" "+e.salary);
		    	}
		    }
		
	}

}
	
