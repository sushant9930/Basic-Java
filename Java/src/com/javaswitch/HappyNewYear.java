package com.javaswitch;

import java.util.Scanner;

public class HappyNewYear {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		/*System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		System.out.println("Select any number from above.");*/
		//int code=1;
		System.out.println("Enter between 1-5");
		int code=sc.nextInt();
		
		
	switch(code) 
	{
	case 1:
		System.out.print("Wish"+" ");
		
	case 2:
		System.out.print("You"+" ");
		
	default:
		System.out.println("A");
		
	case 3:
		System.out.print("Happy"+" ");
		
	case 4:
		System.out.print("New"+" ");
		
	case 5:
		System.out.print("Year");
	
	}

	}

}
