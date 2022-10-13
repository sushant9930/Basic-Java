package com.pattern_01;

/*
	  	    1
	      2 2 2
	    3 3 3 3 3
	  4 4 4 4 4 4 4
	5 5 5 5 5 5 5 5 5
 */
import java.util.Scanner;

public class Pattern_05 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row count:");
		int n = sc.nextInt();
		int b=1;
		for(int i = 1; i <= n; i++) 
		{
			for(int j = n; j >= i; j--) 
			{
				System.out.print(" ");
			}
			for(int k = 1; k <=i; k++) 
			{
				System.out.print(b+" ");			
			}
			b++;
			System.out.println();
		}
	}

}
