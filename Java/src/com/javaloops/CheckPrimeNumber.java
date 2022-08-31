package com.javaloops;

import java.util.Scanner;

public class CheckPrimeNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter start number:");
		int start=sc.nextInt();
		System.out.println("Enter end number:");
		int end=sc.nextInt();
		int j ,flag;
		
		
		System.out.println("Prime numbers between 400-300");
		for(int i=start;i>=end;i--) 
		{
			
			for( j=2;j<=i/2;j++) 
			{
				if(i%j==0) 
				{
					flag=0;
					break;
				}
				if(j>i/2) 
					System.out.println(i);
			
			}
			if(j>i/2) 
			System.out.println(i);
		}
	
	}

}
