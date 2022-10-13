package com.pattern_01;
/*
12345678987654321
 123456787654321
  1234567654321
   12345654321
    123454321
     1234321
      12321
       121
        1

*/
public class Pattern_13 {

	public static void main(String[] args) 
	{
		int n=10;
		for(int i=1; i<n; i++) 
		{
			for(int j=1; j<=i; j++) 
			{
				System.out.print(" ");
			}
			for(int k=1; k<=(n-i); k++) 
			{
				System.out.print(k);
			}
			for(int l=(n-(i+1)); l>=1; l--) 
			{
				System.out.print(l);
			}
			System.out.println();
		}

	}

}
