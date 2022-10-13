package com.pattern_01;

/*
		1
		12
		123
		1234
		12345
		1234
		123
		12
		1

*/
public class Pattern_06 {

	public static void main(String[] args) 
	{
		int r=5, b=0;
		for(int i=1; i<=r; i++) 
		{
			for(int j=1; j<=i; j++) 
			{
				//b++;
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i=r-1; i>=1; i--) 
		{
			for(int j=1; j<=i; j++) 
			{
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
