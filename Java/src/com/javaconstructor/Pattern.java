package com.javaconstructor;

import java.util.Scanner;

public class Pattern
{
	int limit;		
	Pattern( int b)
	{		
		limit=b;				
	}
    void pp() 
	{  int j,i;
		for(i=limit;i>=1;i--)                   //i=9       i8            
		{
			for(j=1;j<=i;j++)                   //j9,j10(f)  j
			{
				System.out.print(" ");
			}
			for(j=limit;j>=i;j--)               //j=9
			{
			    System.out.print(j);				
			}			
			i--;
			System.out.println();			
		}}				
  /*void pp2() {	  
	  int i, j;
	  for (i=1;i<=limit;i++) 
		 {
			 for(j=limit;j>=i;j--) 
			 {
				 System.out.print("* ");
			 }
		    System.out.println();
		 }
		 for(i=1;i<=limit;i++)                 
		{			
			for(j=1;j<=i;j++)                  
			{
				System.out.print("* ");
			}
			System.out.println();
		}		
	}*/
	void display() 
	{
		System.out.println("1)");
		pp();
		System.out.println();
		//System.out.println("2)");
		//pp2();
	}
	public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter Limit:");
		int limit=sc.nextInt();
		Pattern p1=new Pattern(limit);
		p1.display();		
	}
}
