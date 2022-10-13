package com.pattern_01;
/*
     123456789
1		 *
2       *1*
3      *123*
4     *12345*
5    *********



*/
public class Pattern_18 {

	public static void main(String[] args) {
		
		int n=5;
	
		
		for(int row=1;row<=n;row++)                    //r=1      r=2     r=3     r=4        r=5
		{
			for(int space=row;space<n;space++)          //s=1234  s=234   s=34    s=4         
			{
				System.out.print(" ");
			}
			for(int col=1;col<=(2*row-1);col++)         //*       * *     *   *  *     *   ********
			{
				if(col==1 || row==n||col==(2*row-1))     //*
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
				
		}System.out.println();
		}
		
		
		
		
	
	}

}
