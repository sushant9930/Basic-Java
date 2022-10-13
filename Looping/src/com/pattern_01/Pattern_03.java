package com.pattern_01;

import java.util.Scanner;

/*
          
  
  
            *
          * * * 
        * * * * * 
      * * * * * * *
  	* * * * * * * * * 
     
 */


public class Pattern_03 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter limit");
		int n = sc.nextInt();
		
		for(int i=0; i < n; i++)              // i=0
		{
			for(int j=n; j > i; j--)          //j=54321 j=0(false)
			{
				System.out.print(" ");
			}
			for(int k = 0; k <= i; k++ ) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
	}

}
