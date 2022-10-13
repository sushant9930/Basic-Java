package com.whileloop;

import java.util.Scanner;

public class ThreeDigitArmstrongNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a any three digit number: ");
		int n=sc.nextInt();
		
		int num=n, r=0, sum=0;
		
		while(num>0) 
		{
			r=num%10;
			sum=(r*r*r)+sum;
			num/=10;
		}
		if(sum==n) 
		{
			System.out.println(n+" its armstrong number.");
		}
		else 
		{
			System.out.println(n+" its not  armstrong number");
		}

	}

}
