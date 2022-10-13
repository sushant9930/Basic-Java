package com.whileloop;

import java.util.Scanner;

public class CheckArmstrongNumber {
	
	static void armstrong(int n) 
	{
		int temp=n, count=0, sum=0, r=0, cum=0;
		while(temp>0) 
		{
			temp=temp/10;
			count++;
		}
		temp=n;
		while(temp>0) 
		{
			r=temp%10;
			sum+=(Math.pow(r,count));
			temp=temp/10;
		}
		if(n==sum) 
		{
			System.out.println("Its an armstrong number.");
		}
		else 
		{
			System.out.println("Its not an armstrong number.");
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		
		/*
		 * System.out.println("armstrong number upto "+n+" are"); for(int i=0; i<=n;
		 * i++) if(armstrong(i)) { System.out.print(i+" "); }
		 */
		
		armstrong(n);
	}

}
