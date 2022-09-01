package com.Arrays;

import java.util.*;

public class Department 
{
	int id;
	String name;
	void mechanical(int student[],int id,String name) 
	{
		System.out.println();
		System.out.println();
		System.out.println("Department: "+name);
		System.out.println("Department Id: "+id);
		System.out.println("Students Roll No.::");
		for(int i=1;i<=student.length-80;i++) 
		{
			System.out.print(i+" ");
		}
	}
	
	void computer(int student[],int id,String name)
	{
		System.out.println();
		System.out.println();
		System.out.println("Department: "+name);
		System.out.println("Department Id: "+id);
		System.out.println("Students Roll No.::");
		for(int i=21;i<=student.length-60;i++) 
		{
			System.out.print(i+" ");
		}
		
	}
	
	void electrical(int student[],int id, String name )
	{
		System.out.println();
		System.out.println();
		System.out.println("Department: "+name);
		System.out.println("Department Id: "+id);
		System.out.println("Students Roll No.::");
		for(int i=41;i<=student.length-40;i++) 
		{
			System.out.print(i+" ");
		}
	}
	
	void civil(int student[],int id, String name )
	{
		System.out.println();
		System.out.println();
		System.out.println("Department: "+name);
		System.out.println("Department Id: "+id);
		System.out.println("Students Roll No.::");
		for(int i=61;i<=student.length-20;i++) 
		{
			System.out.print(i+" ");
		}
	}
	
	void eTC(int student[],int id, String name )
	{
		System.out.println();
		System.out.println();
		System.out.println("Department: "+name);
		System.out.println("Department Id: "+id);
		System.out.println("Students Roll No.::");
		for(int i=81;i<=student.length;i++) 
		{
			System.out.print(i+" ");
		}
	}	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Student count: ");
		int size=sc.nextInt();
		int student[]=new int[size];
		System.out.println("Total student in Collage in 2022: "+student.length);
		System.out.println();
		System.out.println("Id of Students:");
		for(int i=1;i<=size;i++) 
		{
			System.out.print(i+" ");
		}
				
		Department d=new Department();
		d.mechanical(student,205,"Mechanical Department");
		d.computer(student,206,"Computer Department");
		d.civil(student, 207, "Civil Department");
		d.electrical(student, 208, "Electrical Department");
		d.eTC(student, 209, "Electronics and Telecommunication Department");
	}

}
