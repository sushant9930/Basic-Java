package com.pattern_01;
/*          1          23456      78910
		1	*                     
		2	*          1                                    *
		3	*          12         1                         *
		4	*          123        21                        *
		5	*          1234       321                       *
		6	*          12345      4321                      *
			
			*          1234       321                       *
			*          123        21                        *
			*          12         1                         *
			*          1                                    *
			*
*/
public class Pattern_09 {

	public static void main(String[] args) 
	{
		int r=12, a=r/2;
		
		for(int i=1; i<=a; i++) 
		{
			
			for(int j=1; j==1; j++) 
			{
				System.out.print("*");
				
			}
			
			for(int k=1; k<i; k++) 			
			{
				System.out.print(k);
				
			}
			for(int l=(i-2); l>=1; l--) 
			{
				System.out.print(l);
				
			}
			if(i>=2 && i<=a) 
			{
				for(int p=1; p<=1; p++) {
					System.out.print("*");}
				
			}
		
			System.out.println();
		}
		for(int i=a-1; i>=1; i--) 
		{
			for(int j=1; j==1; j++) 
			{
				System.out.print("*");
			}
			for(int k=1; k<i; k++) 
			{
				System.out.print(k);
			}
			for(int l=(i-2); l>=1; l--) 
			{
				System.out.print(l);
			}
			if(i>=2 && i<=a) 
			{
				for(int p=1; p<=1; p++) {
					System.out.print("*");}
				
				}
			System.out.println();
		}
		

	}

}
