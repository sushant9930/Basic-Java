package com.pattern_01;

/*
		 1								
        121
       12321
      1234321
     123454321
    12345654321
   1234567654321
  123456787654321
 12345678987654321
 
*/
public class Pattern_12 {

	public static void main(String[] args) 
	{
		for(int i=1; i<=9; i++) 
		{
			for(int j=9; j>=i; j--) 
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) 
			{
				System.out.print(k);
			}
			if(i>=2) 
			{
				for(int l=(i-1); l>=1; l--) 
				{
					System.out.print(l);
				}
			}
			System.out.println();
		}
		

	}

}
