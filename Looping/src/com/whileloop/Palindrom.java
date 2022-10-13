package com.whileloop;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int temp=n,r=0,rev=0;
		while(temp>0) 
		{
			r=temp%10;
			rev=(rev*10)+r;
			temp/=10;
		}
		if(n==rev) 
		{
			System.out.println(n+" is a palindrom number");
		}
		else 
		{
			System.out.println(n+" is not palindrom number");
		}
	}

}
