package com.javamethods;

import java.util.Scanner;

public class Student {

	int id;
	
	String name,dept;
	int marks(int m1,int m2,int m3,int m4,int m5) 
	{
		int total=m1+m2+m3+m4+m5;
		return total;
	}
	float percentage(float t) 
	{
		float percentage=(t/5);
		System.out.println("Student obtained percentage in exam is......"+percentage+" %");		
		return percentage;
	}
	void setData(int a, String b, String c)
	{
		id=a;
		name=b;
		dept=c;
	}
	void grade(float p) 
{
		
		if(p>= 85) 
		{
			System.out.println("A+ Grade");
		}
		else if (p >=75 && p < 85)
		{ 
			System.out.println("A Grade");
		}
		else if (p >=65 && p < 75)
		{ 
			System.out.println("B Grade");
		}
		else if (p>=55 && p < 65)
		{ 
			System.out.println(" C Grade");
		}
		else if (p >=45 && p < 55)
		{ 
			System.out.println("D Grade");
		}
		else if (p >=35 && p < 45)
		{ 
			System.out.println("Pass");
		}
		
		else 
		{
			System.out.println("Fail");
		}	
	}
    void display() 
    {
    	System.out.println("Student Id No. is......"+id);
  		System.out.println("Student Department is......"+dept);
  		System.out.println("Student name is......"+name);
    }
    public static void main(String[] args) 
    {
    	Scanner sc=new Scanner(System.in);
    	Student s1=new Student();
    	
    	System.out.println("Enter Student Name:");
    	String name=sc.next();
    	System.out.println("Enter Student id No.:");
    	int id=sc.nextInt();
    	System.out.println("Enter Student department is:");
    	String dept=sc.next(); 
    	System.out.println();
    	System.out.println("Enter here five subject marks.....");
    	System.out.println();
        System.out.println("Enter 1st sub marks:");
    	int n1=sc.nextInt();
    	System.out.println("Enter 2nd sub marks:");
    	int n2=sc.nextInt();
        System.out.println("Enter 3rd sub marks:");
        int n3=sc.nextInt();
    	System.out.println("Enter 4th sub marks:");
    	int n4=sc.nextInt();
        System.out.println("Enter 5th sub marks:");
        int n5=sc.nextInt();
    	
   
    	int total=s1.marks(n1,n2,n3,n4,n5);

    	s1.setData(id, name, dept);
    	
    	 System.out.println();
         System.out.println("Enter 2nd number student:");

    	Student s2=new Student();	
		System.out.println("Enter Student Name:");
    	name=sc.next();
    	System.out.println("Enter Student id No.:");
        id=sc.nextInt();
    	System.out.println("Enter Student department is:");
    	dept=sc.next(); 
    	System.out.println();
    	System.out.println("Enter here five subject marks.....");
    	System.out.println();
    	System.out.println("Enter 1st sub marks:");
    	n1=sc.nextInt();
    	System.out.println("Enter 2nd sub marks:");
    	n2=sc.nextInt();
        System.out.println("Enter 3rd sub marks:");
        n3=sc.nextInt();
    	System.out.println("Enter 4th sub marks:");
    	n4=sc.nextInt();
        System.out.println("Enter 5th sub marks:");
        n5=sc.nextInt();
        s2.setData(id, name, dept);
        System.out.println();
        System.out.println("Enter 3rd number student:");
        
        Student s3=new Student();	
		System.out.println("Enter Student Name:");
    	name=sc.next();
    	System.out.println("Enter Student id No.:");
        id=sc.nextInt();
    	System.out.println("Enter Student department is:");
    	dept=sc.next(); 
    	System.out.println();
    	System.out.println("Enter here five subject marks.....");
    	System.out.println();
        System.out.println("Enter 1st sub marks:");
    	n1=sc.nextInt();
    	System.out.println("Enter 2nd sub marks:");
    	n2=sc.nextInt();
        System.out.println("Enter 3rd sub marks:");
        n3=sc.nextInt();
    	System.out.println("Enter 4th sub marks:");
    	n4=sc.nextInt();
        System.out.println("Enter 5th sub marks:");
        n5=sc.nextInt();
        s3.setData(id, name, dept);
    	
        
        System.out.println("Details of students:");
        System.out.println("1st Student details:");
        s1.display();
        float percentage=s1.percentage(total);
        s1.grade(percentage);
        
         System.out.println();
		 System.out.println("2nd Student details:");
	     s2.display();
	     float percentage1=s2.percentage(total);
	     s2.grade(percentage1);
	     
	     System.out.println();
		 System.out.println("3rd Student details:");
	     s3.display();
	     float percentage2=s3.percentage(total);
	     s3.grade(percentage2);
	     }}