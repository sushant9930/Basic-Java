package com.javaloops;

import java.util.Scanner;

public class Findnumber {

	public static void main(String[] args) 
	{Scanner sc=new Scanner(System.in);
		System.out.println("Enter base number");
		int base=sc.nextInt();
		System.out.println("Enter power number");
		int power=sc.nextInt();
		int product=1;
		int c=1;
		for(;c<=power;c++) 
		{product=product*base;}
		System.out.println("Ans...."+product);
		
	}}

		

				
	
		

	


