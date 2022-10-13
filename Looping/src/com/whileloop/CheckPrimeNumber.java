package com.whileloop;

import java.util.Scanner;

public class CheckPrimeNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		
		int i=2,num=n, count=0;
		while(i<=num/2) 
		{
			if(num%i==0) 
			{
				count++;
			}
			i++;
		}
		if(count==0) 
		{
			System.out.println(n+" Its prime number");
		}
		else 
		{
			System.out.println(n+" Its not prime number");
		}

	}

}
