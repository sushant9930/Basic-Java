package com.javaloops;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Where ");
		int i=1,a=0,b=1;
		for (i=1;i<=10;i++)            //  1          2       3        4        5    6      7       8           9          10
		{
			int c =a + b;             //0=0+1=1      1+0=1   1+1=2    2+1=3   3+2=5 3+5=8  5+8=13   8+13=21   21+13=34   34+21=55
			
			 b=a;                     //b=0          b=1     b=1      b=2     b=3   b=5    b=8      b=13      b=21        b=34
			 a=c;                     //a=1          a=1     a=2      a=3     a=5   a=8    a=13     a=21      a=34        a=55
			 System.out.println(b);
		}
	
		
	}

}
