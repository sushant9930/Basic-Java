package com.whileloop;

import java.util.Scanner;

public class HarshadNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int temp=n,r=0,sum=0;
		
		while(temp>0)
		{
			r=temp%10;
			sum=sum+r;
			temp/=10;
		}
		if(n%sum==0) 
		{
			System.out.println(n+" is a harshad number.");
		}
		else 
		{
			System.out.println(n+" is not a harshad number.");
		}
		

	}

}
