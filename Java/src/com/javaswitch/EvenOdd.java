package com.javaswitch;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1: Even");
		System.out.println("2: Odd");
		System.out.println("Please choose any above...");
		int number=sc.nextInt();
		System.out.println("Please enter your number...");
		int number1=sc.nextInt();
		
		switch(number) 
		{
		case 1:
			
			if (number1%2==0) 
			{
				System.out.println("Your enter number is Even");
			}
			else
			{
				System.out.println("Your selected number is Odd");
				System.out.println("Please enter another number");
				
			}
			
			break;
		case 2:
			if(number1%2!=0)
			{
			    System.out.println("Your selected number is Odd");
			}
			else
			{
				System.out.println("Your enter number is Even");
				System.out.println("Please enter another number");
			}
			break;
		default:
			System.out.println("Please enter number only.");
		
			}
		
		

	}

}
