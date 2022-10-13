package com.whileloop;

import java.util.Scanner;

//Write a program to calculate product of digits of any number.
public class ProductOfNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		
		int num=n, r=0, pro=1;
		while(num>0) 
		{
			r=num%10;
			pro=pro*r;
			num/=10;
		}
		System.out.println("Product of number: "+pro);

	}

}
