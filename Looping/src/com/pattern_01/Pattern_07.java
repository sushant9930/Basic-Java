package com.pattern_01;
/*
 			1 			
			123			
			12345			
			1234567			
			123456789
			1234567
			12345
			123
			1
 
 */

public class Pattern_07 {

	public static void main(String[] args) 
	{
		for(int i=1; i<10; i++) 
		{
			if(i%2!=0) {
			for(int j=1; j<=i; j++) 
			{
				System.out.print(j);
			}
			}
			else 
			{
				System.out.println("");
			}
		}
		
		for(int i=(10-2); i>=1; i--) 
		{
			if(i%2!=0) 
			{	
				for(int j=1; j<=i; j++) 
				{
					System.out.print(j);
				}
			}
			else 
			{
				System.out.println("");
			}
		}
		

	}

}
