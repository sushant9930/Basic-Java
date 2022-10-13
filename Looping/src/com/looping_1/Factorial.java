package com.looping_1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number where you stop: ");
		int num=sc.nextInt();
		int fact = 1;
		for(int i=1; i <= num; i++)             		//i=1		i=2				i=3
		{
			fact = fact * i;							//1*1=1		fact=1*2=2		fact=2*3=6
		}
		System.out.println("Factorial: "+fact);
	}
}

/*
  
 fact = fact * I; 
 
 fact = 1 * 1 = 1
 fact = 1 * 2 = 2
 fact = 2 * 3 = 6
 fact = 6 * 4 = 24
 fact = 24 * 5 = 120
*/