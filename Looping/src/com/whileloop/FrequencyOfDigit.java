package com.whileloop;

import java.util.Scanner;

//Write a program to find frequency of each digit in a given integer.

public class FrequencyOfDigit {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		System.out.println("Enter which digit frequency you want: ");
		int r1=sc.nextInt();
		int num=n,r=0, count=0, count1=0;
		while(n>0) 
		{
			r=n%10;                     		
			if(r==r1) 
			{
				count++;
			}
			n/=10;	
		}
		System.out.println(r1+" frequency is: "+count);

	}

}
