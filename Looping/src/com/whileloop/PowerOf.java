package com.whileloop;

import java.util.Scanner;

public class PowerOf {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base number: ");
		int base=sc.nextInt();
		System.out.println("Enter power of number:");
		int power=sc.nextInt();
		
		int i=1, res=1;
		while(i<=power) 
		{
			res=res*base;
			i++;
		}
		System.out.println("Power of: "+res);
	}

}
