package com.looping_1;

import java.util.Scanner;

public class PrimeNumber {

	static void prime(int num) 
	{
		int i=2, temp=num/2, count=0;
		while(i<=temp) 
		{
			if(num%i==0) 
			{
				count++;
			}
			i++;
		}
		if(count==0) 
		{
			System.out.println(num+" is prime number.");
		}
		else 
		{
			System.out.println(num+" is not prime number.");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number which you want check: ");
		int num=sc.nextInt();
		
		
		prime(num);
	}

}
