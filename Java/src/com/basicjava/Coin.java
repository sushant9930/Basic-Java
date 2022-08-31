package com.basicjava;

import java.util.Scanner;

public class Coin {

	public static void main(String[] args) 
	{		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter the age :");
		
		int age = sc.nextInt();
		int coin = age * age * age;
		if (age > 0)
		{
			System.out.println("Meenu gets " +" "+ coin + " " + "coins");
		}	
		else 
			System.out.println("invalid Age");
	}

}
