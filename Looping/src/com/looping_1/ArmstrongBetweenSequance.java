package com.looping_1;

import java.util.Scanner;

public class ArmstrongBetweenSequance {
	
	static void armstrong() 
	{
		for(int i=1; i<=1000; i++) 
		{
			int a, r=0, sum=0;
			a=i;
			while(a>0) 
			{
				r=a%10;
				sum=sum+(r*r*r);
				a=a/10;
			}
			if(i==sum) 
			{
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		/*System.out.println("Enter start point:");
		int n1=sc.nextInt();
		
		
		System.out.println("Enter end point:");
		int n2=sc.nextInt();
		*/
		armstrong();

	}

}
