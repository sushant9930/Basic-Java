package com.whileloop;

import java.util.Scanner;

public class Automorphic {
	
	static boolean auto(int n) 
	{
		//int num=n;
		int sqr=n*n;
		while(n>0) 
		{
			if(n%10 != sqr%10) 
			{
				return false;
			}
			n/=10;
			sqr/=10;
		}
		return true;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		
		if(auto(n)==true) 
		{
			System.out.println("Automorphic number.");
		}
		else 
		{
			System.out.println("Not an automorphic number.");
		}
	}

}
