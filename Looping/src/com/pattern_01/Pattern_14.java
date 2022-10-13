package com.pattern_01;
/*
		 9
        898
       78987
      6789876
     567898765
    45678987654
   3456789876543
  234567898765432
 12345678987654321

*********9
********89
*******789
******6789
*/
public class Pattern_14 {

	public static void main(String[] args) 
	{
		int n=10;
		for(int i=1; i<n; i++)                  //i=1					i=2				i=3				i=4	
		{
			for(int j=n; j>i; j--) 				//j=1098765432			j=109876543		j=10987654		j=1098765
			{
				System.out.print(" ");
			}
			for(int k=(n-i); k<n;k++)			//k=9					k=89			k=789			k=6789
			{
				System.out.print(k);
			}
			if(i>=2) 
			{
			for(int l=(n-2); l>=(n-i); l--) //n-(i+1)
			{
				System.out.print(l);
			}			
			}	
			System.out.println();
		}

	}
				
}
