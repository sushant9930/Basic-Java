package com.pattern_01;
/*
	  **********
      ****  ****
      ***    ***
      **      **
      *        *
      *        *
      **      **
      ***    ***
      ****  ****
      **********



*/
public class Pattern_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		for(int i=1; i<n; i++) 
		{
			for(int j=n; j>i; j--) 
			{
				System.out.print("*");
			}
			for(int k=i; k>n; k++ ) 
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
