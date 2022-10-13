package com.pattern_01;
/*
		1
		121
		12321
		1234321
		123454321
		1234321
		12321
		121
		1



*/
public class Pattern_08 {

	public static void main(String[] args) {
				
		int r=10, n=((r/2)-1);
		int a=(r/2)-1;
		for(int i=1; i<=r/2; i++)
		{
				for(int j=1; j<=i; j++) 
				{
					System.out.print(j);				
				}
				for(int k=(i-1); k>=1; k--) 
				{
					System.out.print(k);
				}			
				System.out.println();
		}
		for(int i=n; i>=1; i--) 
		{
			for(int j=1; j<=i; j++) 
			{
				System.out.print(j);
			}
			for(int k=(i-1); k>=1; k--) 
			{
				System.out.print(k);
			}
			System.out.println();
		}

	}

}
