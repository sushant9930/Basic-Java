package com.looping_1;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base number:");
		int n = sc.nextInt();
		System.out.println("Enter power:");
		int p = sc.nextInt();
		int res=1;
		for(int i = 1; i <= p; i++) 
		{
			res *= n;
		}
		System.out.println("Power of base number: "+res);
		
	}

}
