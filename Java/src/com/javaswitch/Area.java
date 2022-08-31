package com.javaswitch;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("1:Circle");	
		System.out.println("2:Rectangle");
		System.out.println("3:Triangle");
		System.out.println("4:Square");
		System.out.println("Enter your choice ");
		
		int opp=sc.nextInt();
		
		switch(opp) 
		{
		case 1:  
		System.out.println("Enter radius of circle... ");
		float a= sc.nextInt();
		System.out.println("Area of circle wth radius is..."+(3.1415926535897*a*a));
		System.out.println("Circumference of Circle is...."+(2*3.1415926535897*a));
		break;
			
		case 2: 
			System.out.println("Enter Width... ");
			int c = sc.nextInt();
			System.out.println("Enter Length... ");
			int b= sc.nextInt();
		    System.out.println("Area of Rectangle  is.."+(c*b));
			break;
			
		case 3:  
			System.out.println("Enter  Height... ");
			int e= sc.nextInt();
			System.out.println("Enter Base... ");
			int f= sc.nextInt();
		    System.out.println("Area of Triangle is.."+(0.5*e*f));
			break;
			
		case 4:  
			System.out.println("Enter side... ");
			int k= sc.nextInt();
		    System.out.println("Area of Square  is.."+(k*k));
		    System.out.println("Perimeter of Square  is.."+(4*k));
			break;
		default:
			System.out.println("Enter valid number...");
	}
	}
}
