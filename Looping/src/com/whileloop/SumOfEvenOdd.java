package com.whileloop;

import java.util.Scanner;

/*
	 Write a program to find sum of all even numbers between 1 to n. 
	 Write a program to find sum of all odd numbers between 1 to n.
*/
public class SumOfEvenOdd {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter start point:");
		int n1=sc.nextInt();
		System.out.println("Enter end point: ");
		int n2=sc.nextInt();
		
		int i=n1, sum=0, sum1=0;
		while(i<=n2) 
		{
			if(i%2==0) 
			{
				sum=sum+i;
			}
			if(i%2!=0) 
			{
				sum1=sum1+i;
			}
			i++;
		}
		System.out.println("Addition of even number: "+sum);
		System.out.println("Addition of odd number: "+sum1);
	}

}
