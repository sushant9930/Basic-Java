package com.javaloops;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:  ");
		int givennum = sc.nextInt();
		int n = 2;
		
		int divisiblecount = 0;
		
		  while (n <= givennum/2 )       //n=givennum/2,  2=55/2,  n=27.5              /        n=givennum/2,  2=13.75/2,  n=6.75              / n=givennum/2,  2=6.75/2,  n=3.375      
		  {     
		   if (givennum % n == 0)        // if 55%2==0    in 1st round not satisfied     /      if 5%2==0    in 2st round not satisfied   / if 0%2==0    in 2st round not satisfied
		   {      
		    divisiblecount++;            // divisiblecount++ means now divisiblecount=1   /     divisiblecount++ means now divisiblecount=2    / divisiblecount++ means now divisiblecount=2
		    
		   }
		   n++;                           // n++ means now n=3                            /     n++ means now n=3
		  }
		  if (divisiblecount == 0 ) {
		   System.out.print(givennum + " is a prime number ");
		  } else {
		   System.out.print(givennum + " is not a prime number ");
		  }
		}
		
	}


