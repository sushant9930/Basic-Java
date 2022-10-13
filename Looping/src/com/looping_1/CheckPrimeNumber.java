package com.looping_1;

import java.util.Scanner;

public class CheckPrimeNumber {
	
	static void prime(int num1, int num2) 
	{
		int j, flag=0;
		for(int i=num1; i>=num2; i--)         //i=400
		{
			for(j=2; j<=i/2; j++) 			  //j=2
			{
				if(i%j==0) 					  //400%2=200
				{
					flag=0;
					break;
				}
				if(j>i/2) 
				{
					System.out.println(i);
				}
			}
			if(j>i/2) 
			{
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter start point:");
		int num1=sc.nextInt();
		System.out.println("Enter end Point:");
		int num2=sc.nextInt();
		
		prime(num1, num2);

	}

}
