	package com.aggregation;

import java.util.Arrays;
import java.util.Scanner;

public class MainStudent {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number of departments:");
		int dno=sc.nextInt();
		Department dd[]=new Department[dno];
		for(int j=0; j<dd.length;j++) 
		{
			System.out.println("Enter department Id no: ");
			int id1=sc.nextInt();
			System.out.println("Enter department name");
			String dname=sc.next();
			System.out.println("Enter count of students: ");
			int size=sc.nextInt();
			Student ss[]=new Student[size];
			for(int i=0; i<ss.length; i++) 
			{	
				System.out.println(i+1+")");
				System.out.println("Enter student Id No.:");
				int id=sc.nextInt();
				System.out.println("Enter student name (First name):");
				String name=sc.next();
				System.out.println("Enter email address:");
				String email=sc.next();
				System.out.println("Enter percentage:");
				float per=sc.nextFloat();
				
				Student s=new Student();
				s.setId(id);
				s.setName(name);
				s.setEmail(email);
				s.setPer(per);
				ss[i]=s;
		}

		
				Department d=new Department();
				
				System.out.println();
				
				d.setId(id1);
				d.setDeptname(dname);
				d.setSs(ss);
				dd[j]=d;
				
		}
		
		
		for(Department dd1:dd) 
		{
			//System.out.println("Department Id no.: "+dd1.getId()+"\nDepartment name: "+dd1.getDeptname());
			System.out.println(dd1);
			System.out.println();
			
		}
		
	
		
	
	}

}
