package com.basicjava;

import java.util.Scanner;

public class CheckDivisible {

	public static void main(String[] args) 
	{
       System.out.println("Enter number :");
       try (Scanner sc = new Scanner (System.in)) {
		int num1 = sc.nextInt();
		
		if (num1%5==0 || num1%11==0) 
		{
		    System.out.println("Given number divisible by 5 and 11 is.....");
		}
		else 
		{
		    System.out.println("Given number is not divisible by 5 and 11....");
		}
	}
	}

}
