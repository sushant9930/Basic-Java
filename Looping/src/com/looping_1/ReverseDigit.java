package com.looping_1;

import java.util.Scanner;

public class ReverseDigit {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number more than two digit:");
		int num=sc.nextInt();
		int n=num, r=0, rev=0 ;
		
		while(n!=0) 
		{
			r=n%10;
			rev=(rev*10)+r;
			n/=10;
			
		}
		System.out.println(rev);
		

	}

}
