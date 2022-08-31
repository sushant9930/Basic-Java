package com.javaswitch;

import java.util.Scanner;

public class PrintNumber1_5 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		System.out.println("Please select above...");
		int num=sc.nextInt();
			
	switch(num) 
	{
	case 1:
		System.out.println("1");
	
	
	case 2:
		System.out.println("2");
	
	
	case 3:
		System.out.println("3");
	
	
	case 4:
		System.out.println("4");
	
	
	case 5:
		System.out.println("5");
	
	
	default:
		System.out.println("Number not from list ");
	
	}
		
		

	}

}
