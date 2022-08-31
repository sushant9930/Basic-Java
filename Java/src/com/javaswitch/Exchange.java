package com.javaswitch;

import java.util.Scanner;

public class Exchange {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		System.out.println("Choose any number from above..");
		
		int num=sc.nextInt();
		
		switch(num) 
		{
		case 1:
			System.out.println("One");
		break;
		
		case 2:
			System.out.println("Two");
		break;
		
		case 3:
			System.out.println("Three");
		break;
		
		case 4:
			System.out.println("Four");
		break;
		
		case 5:
			System.out.println("Five");
		break;
		
		default:
			System.out.println("Please value choice from above list");
		}
		

	}

}
