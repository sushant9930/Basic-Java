package com.pattern_01;

/*
A B C D E F 
A B C D E 
A B C D 
A B C 
A B 
A 
A 
A B 
A B C 
A B C D 
A B C D E 
A B C D E F

 */

public class Pattern_15 {
	
		public static void main(String[] args) {
		
		for(int i=1; i<7 ; i++) {
			
			for(int j=1; j<=(7-i); j++) {
				System.out.print((char)(j+64)+" ");
			}
			
			System.out.println();	
		}
		for(int i=1; i<7; i++) 
		{
			for(int j=1; j<=i; j++ ) 
			{
				System.out.print((char)(j+64)+" ");
			}
			System.out.println();
		}
		
		
		
		
		

	}

}
