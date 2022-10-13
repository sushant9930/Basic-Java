package com.pattern_01;
/*
  	   1 
      2 2 
     3 3 3 
    4 4 4 4 
   5 5 5 5 5 
  6 6 6 6 6 6 
 7 7 7 7 7 7 7 
 
 
 
 */

public class Pattern_11 {

	public static void main(String[] args) 
	{
		int p=1;
		for(int i=1; i<=7; i++)
		{
			for(int j=7; j>=i; j--) 
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) 
			{
				System.out.print(p+" ");
			}
		p++;
		System.out.println();
		}
	}

}
