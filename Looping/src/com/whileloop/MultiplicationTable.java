package com.whileloop;

import java.util.Scanner;
/*
	Write a program that prompts the user to input a positive integer.
	It should then print the multiplication table of that number. 

*/
public class MultiplicationTable {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter positive integer: ");
		int n=sc.nextInt();
		
		int i=1, ans=0;
		while(i<=10) 
		{
			ans=n*i;
		System.out.println(ans);
			i++;
		
		}
		
	}

}
