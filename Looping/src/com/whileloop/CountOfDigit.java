package com.whileloop;

import java.util.Scanner;

// 	Write a program to count number of digits in any number

public class CountOfDigit {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		
		int  r=0, count=0;
		while(n>0) 
		{
			r=n%10;
			count++;
			n/=10;
			
		}
		System.out.println("Count of digit in given number is: "+count);

	}

}
