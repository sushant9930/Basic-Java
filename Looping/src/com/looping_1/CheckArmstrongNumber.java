package com.looping_1;

import java.util.Scanner;

//153 = 1*1*1 + 5*5*5 + 3*3*3  // 153 is an Armstrong number.
public class CheckArmstrongNumber {
	
	static void armstrong(int num) 
	{
		int n=num, r=0, cnt=0, product=1, sum=0;
		while(n>0) 
		{
			r=n%10;
			sum=(r*r*r)+sum;
			n/=10;			
		}
		if(num==sum) 
		{
			System.out.println("It is Armstrong number.");
		}
		else 
		{
			System.out.println("It is not Armstrong number.");
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three digit number: ");
		int num=sc.nextInt();
	
		armstrong(num);
	}
}
