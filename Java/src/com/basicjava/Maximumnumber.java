package com.basicjava;

import java.util.Scanner;

public class Maximumnumber {

	public static void main(String[] args) 
	{
	
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter numbers 1 :");
	float number1 = sc.nextFloat();
	System.out.println("Enter numbers 2 :");
	float number2 = sc.nextFloat();
	System.out.println("Enter numbers 3 :");
	float number3 = sc.nextFloat();
	

	if (number1>number2 && number1>number3) 
	{
		System.out.println("Greatest number is :"+" "+number1);
	}
	
	else if (number2>number1 && number2>number3) 
	{
		System.out.println("Greatest number is :"+" "+number2);
	}
	
	else if (number3>number1 && number3>number2)
	{
		System.out.println("Greatest number is :"+" "+number3);
	}
	
	else 
	{
		System.out.println("Enter values are same please try again");
	}
	}

}
