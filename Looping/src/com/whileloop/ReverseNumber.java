package com.whileloop;

import java.util.Scanner;
/*
	Write a program that prompts the user to input an integer 
	and then outputs the number with the digits reversed. For example, 
	if the input is 12345, the output should be 54321.
*/
public class ReverseNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		
		int r=0,rev=0;
		while(n>0) 
		{
			r=n%10;
			rev=(rev*10)+r;
			n/=10;
		}
		System.out.println("Reverse the number: "+rev);

	}

}
