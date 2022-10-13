package com.looping_1;

import java.util.Scanner;

public class PrimeNumber01 {

	public static boolean isPrime(int n) 
	{
		/*if(n == 0 || n == 1) 
		{
			return false;
		}
		if(n == 2) 
		{
			return true;
		}*/
		for(int i=2; i <= n/2; i++)        // i=2     i=3           
		{
			if(n % i == 0) 				   // 5%2=1  5%3=2       
			{
				return false;              //!=false  !=false    
			}
		}
		return true;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a number: ");
		int s = sc.nextInt();
		System.out.println(s+" is prime number or not\n"+isPrime(s));
		System.out.println(isPrime(49));
	}

}
