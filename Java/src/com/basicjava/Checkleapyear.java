package com.basicjava;

import java.util.Scanner;

public class Checkleapyear {

	public static void main(String[] args) 
	{
	System.out.println("Enter an Year :");
     Scanner sc = new Scanner (System.in) ;
		int year = sc.nextInt();
		     
		if (year%4==0 && year%100!=0 || year%400==0) 
		{     
		System.out.println(" This is leap year");	 
		 }
		else 
		{
			System.out.println("This is not leap year");
		}
	}
	}
	


