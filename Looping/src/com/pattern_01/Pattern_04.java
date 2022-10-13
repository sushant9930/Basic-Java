package com.pattern_01;

/*
	* * * * 
	*     * 
	*     * 
	* * * * 
	*     * 
	*     * 
	* * * * 

*/
public class Pattern_04 {

	public static void main(String[] args) 
	{		
		for( int i = 0; i < 7 ; i++) 
		{
			for(int j = 0; j<=(7/2); j++)
			{
				if(i%3 == 0) 
				{
					System.out.print("* ");
				}
			}
			if(i%3!=0) 
			{
				for(int k = 0; k <=(7/2) ; k++) 
				{
					if(k%3!=0) 
					{
						System.out.print("  ");
					}
					else 
					{
						System.out.print("* ");
					}
				}
				
			}
			System.out.println();
		}
		
	

	}

}
