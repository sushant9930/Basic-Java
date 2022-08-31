package com.javaloops;

import java.util.Scanner;

public class Primenumber1 {

	public static void main(String[] args) 
	{
		int num, i, cf=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter number:");
		num=sc.nextInt();
		
		i=1;
		while(i<=num) 
		{
			if(num%i==0)                    //n=givennum/2,  2=7/2,  n=3.5        //   n=givennum/2,  2=3/2,  n=1.75      // n=givennum/2,  2=1.75/2,  n=0.875
			{
				cf++;}                      // cf++ means c=0                    //   cf++ means c=1                     // cf++ means c=2 
				if(cf>2)
					{break;}
				i++;                        //i++ means i=1                      //  i++ means i=2                       // i++ means i=3
				
			}
			if(cf==2) 
			{
				System.out.println(num+"is prime number");
			}
			else 
			{
				System.out.println(num+"is not prime number");
			}
			
		}
				

	}


