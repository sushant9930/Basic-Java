package com.pattern_01;
/*
	 1
    212
   32123
  4321234
 543212345
  4321234
   32123
    212
     1
*/
public class Pattern_20 {
	
	public static void main(String[] args) {
		
		int n=6;
		for(int i=1; i<n; i++) 
		{
			for(int k=n; k>i; k--) 
			{
				System.out.print(" ");
			}
			for(int j=i; j>=1; j--) 
			{
				System.out.print(j);
			}
			if(i>=2) 
			{
				for(int l=2; l<=i; l++) 
				{
					System.out.print(l);
				}
			}
			System.out.println();
		}
		for(int i=(n-2); i>=1; i--) 
		{
			for(int k=(n-1); k>=i; k--) 
			{
				System.out.print(" ");
			}
			for(int j=i; j>=1; j--) 
			{
				System.out.print(j);
			}
			if(i<=4 && i>=2) 
			{
				for(int p=2; p<=i; p++) 
				{
					System.out.print(p);
				}
			}
			System.out.println();
		}
	}

}
