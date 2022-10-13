package com.pattern_01;

/*
	 * 
	 * *
	 * * *
	 * * * *
	 * * * * *
	 * * * *
	 * * *
	 * * 
	 *  
	  
	  
  */
public class Pattern_02 {

	public static void main(String[] args) 
	{
		int n=5;
		char c='a';
		for(int i=0; i<n; i++) 
		{
			for(int j=0; j<=i; j++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		c++;
		}
		c++;
		for(int k=n-1; k>=1; k--) 
		{
			for(int j=1; j<=k; j++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		c++;
		}

	}

}
