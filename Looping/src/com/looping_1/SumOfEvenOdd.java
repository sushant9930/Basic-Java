package com.looping_1;

import java.util.Scanner;

public class SumOfEvenOdd {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter limit: ");
		int limit = sc.nextInt();
		int sum1=0, sum2=0;
		
		for(int i = 1; i <= limit; i++) 
		{
			if(i%2==0) 
			{
				sum1=sum1+i;
			}
			else 
			{
				sum2=sum2+i;
			}
		}
		System.out.println("Sum of even number: "+sum1);
		System.out.println("Sum of odd number: "+sum2);

	}

}
