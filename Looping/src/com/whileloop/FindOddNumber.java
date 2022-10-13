package com.whileloop;

import java.util.Scanner;

//  WAP to print odd numbers from 521 to 229 using while loop. 
public class FindOddNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your start point:");
		int n1=sc.nextInt();
		System.out.println("Enter your end point:");
		int n2=sc.nextInt();
		
		System.out.println("Odd numbers between 521 to 229");
		int i=n1;
		while(i>=n2) 
		{
			if(i%2!=0) 
			{
				System.out.println(i);
			}
		i--;
		}

	}

}
