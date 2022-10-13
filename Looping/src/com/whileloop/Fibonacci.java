package com.whileloop;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Chech fibonacci number:");
		System.out.println("enter a number where you stop: ");
		int n=sc.nextInt();
		
		int i=1, a=0,b=1;
		while(i<=n) 
		{
			int c=a+b;
			
			b=a;
			a=c;
			System.out.println(b);
			i++;
		}

	}

}
