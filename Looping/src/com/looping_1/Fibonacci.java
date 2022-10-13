package com.looping_1;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter where you stop:");
		int limit=sc.nextInt();
		int a=0, b=1, c;
		for(int i=2; i<=limit; i++) 
		{
			c=a+b;
			System.out.println(b);
			a=b;
			b=c;
			
		}
		


	}

}
