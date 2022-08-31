package com.javaloops;

import java.util.Scanner;

public class Oddaddition {

	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("enter limit");
		int limit= sc.nextInt();
		int sum=0;
				
		int c=1;
		while(c<=limit) 
		{
			if(c%2!=0)                           // 1 3 5 7 9 11 13
			sum=sum+c;
				//1+0=1, 1+3=4, 4+5=9
				
				
			c++;
		}
		System.out.println("Addition is...."+sum);
	}

}
