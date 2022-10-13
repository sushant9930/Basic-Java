package com.pattern_01;
/*
 	 	 1
        1 2
       1 2 3
      1 2 3 4
     1 2 3 4 5
    1 2 3 4 5 6
   1 2 3 4 5 6 7

 
 
 */
public class Pattern_10 {

	public static void main(String[] args) 
	{
		for(int i=1; i<=7; i++) 
		{
			for(int j=7; j>=i; j--) 
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) 
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}

	}

}
