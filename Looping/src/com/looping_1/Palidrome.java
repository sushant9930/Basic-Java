package com.looping_1;

import java.util.Scanner;

/*
 	Palindrome number in java: A palindrome number is a number 
 	that is same after reverse. 
 	For example 545, 151, 34543, 343, 171, 48984 
 	are the palindrome numbers.
 	It can also be a string like LOL, MADAM etc.
*/
public class Palidrome {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		
		
		int n, r=0, rev=0;
		n=num;
		while(n!=0) 
		{
			r=n%10;
			rev=(rev*10)+r;
			n/=10;
		}
		if(num==rev) 
		{
			System.out.println("It is palindrome.");
		}
		else 
		{
			System.out.println("It is not a palindrome.");
		}

	}

}
