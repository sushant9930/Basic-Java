package com.looping_1;

import java.util.Scanner;

/*
	Write a program that prompts the user to input a positive integer. 
	It should then print the multiplication table of that number. 
*/
public class PrintTable {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter any positive number: ");
		int n = sc.nextInt();		
		for(int i = 1; i <= 10; i++) 
		{
			System.out.println(n*i);
		}
	}

}
