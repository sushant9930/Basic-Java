package com.javaconstructor;

public class Pattern1 {

	public static void main(String[] args)
	
	{
		int r=4;
		int i,j;
		char ch;		
		for(i=1;i<=r;i++) 
		{ ch='a';
			for(j=1;j<=i;j++) 
			{ 
				System.out.print(ch+" ");
				ch++;
			}			
		System.out.println();
		}		
		for(i=r-1;i>=1;i--) 
		{ch='a';
			for(j=1;j<=i;j++) 
			{
				System.out.print(ch+" ");
				ch++;
			}
			
			System.out.println();
		}
	}

}
