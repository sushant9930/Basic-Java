package com.javaloops;

import java.util.Scanner;

public class ProductOfNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();		
		int i=1,j=1,r=0,prod=1;
	 
		while(num!=0) 
		{
			r=num%10;
			prod*=r;
			num/=10;
			}
		System.out.println("Product of given number is..."+prod);
	
		

	}

}
