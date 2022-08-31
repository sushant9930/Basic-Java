package com.javaloops;

import java.util.Scanner;

public class SquareOfNumbers {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Start number");
		int start=sc.nextInt();
		System.out.println("Enter limit");
		int limit=sc.nextInt();
		
		int j=1,result=0;
		System.out.println("Squares of numbers is...");
			for (;j<=limit;j++)
			{
			   result=start*j;
			   
			   System.out.println(result);
			}
			

		}

	

}
