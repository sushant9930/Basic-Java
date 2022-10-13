package com.looping_1;

import java.util.Scanner;

public class HighestCommonFactor {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the first number:");
		int n1 = sc.nextInt();
		System.out.println("Enter the second number:");
		int n2 = sc.nextInt();
		int remainder, hcf=0;
		do 
		{
			remainder = n1 % n2;
			if(remainder == 0) 
			{
				hcf = n2;
			}
			else 
			{
				n1 = n2;
				n2 = remainder;
			}
		}while(remainder != 0);
		
		System.out.println("Higest Common Factor: "+hcf);

	}

}
