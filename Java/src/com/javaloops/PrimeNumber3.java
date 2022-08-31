package com.javaloops;

import java.util.Scanner;

public class PrimeNumber3 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		char ch;
		do {
		int num,mid,a=400,c=2;
		
		System.out.println("Enter a number between 300-400:");
		num= sc.nextInt();
		mid=num/2;
		while(a>=300) {
		while (c<=mid) 
		{if(num%c==0) 
			{
				break;
			}
			c++;			
		}
		a++;
		}	
		if (c>mid) 
		{	
	System.out.println("This number is prime number ");			
		}
		else if(c<mid)
		{
			System.out.println("This number is not prime number ");		
		}
		if (num<300 || num>400) 
		{
			System.out.println("Note:Please choose number between 300-400");
		}	
		System.out.println("You want to check another number between 300-400 if yes press 'Y'or 'y'");
		ch=sc.next().charAt(0);
		}while(ch=='Y' || ch =='y');		
		}
	}


