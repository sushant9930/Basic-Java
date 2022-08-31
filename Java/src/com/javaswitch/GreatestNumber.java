package com.javaswitch;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1: Greater Number");
		System.out.println("2: Smallest Number");
		System.out.println("Which you want from above please select?");
		int choice=sc.nextInt();
		float num1,num2;
		
		
	switch(choice) 
	{
	case 1:
		System.out.println("Please enter two number which you want");
		num1= sc.nextFloat();
	    num2= sc.nextFloat();
		if(num1>num2) 
		{
			System.out.println("Number 1 is greater than number 2");
		}
		else if(num2>num1) 
		{
			System.out.println("Number 2 is greater than number 1");
		}
		else 
		{
			System.out.println("Both number are same");
		}
	break;
	
	case 2:
		System.out.println("Please enter two number which you want");
		num1= sc.nextFloat();
	    num2= sc.nextFloat();
		if(num1<num2) 
		{
			System.out.println("Number 1 is smaller than number 2");
		}
		else if(num2<num1) 
		{
			System.out.println("Number 2 is smaller than number 1");
		}
		else 
		{
			System.out.println("Both numbers are same");
		}
	}

	}

}
