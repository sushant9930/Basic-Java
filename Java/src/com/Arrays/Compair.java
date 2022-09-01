package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Compair {
	
	void comp(int a[],int b[]) 
	{
		
		for(int i=0;i<a.length;i++) 
		{
			for(int j=0;j<i;j++) 
			{
				if(a[i]==b[j] && a.length==b.length ) 
				{
					
					System.out.println("Both are same");
				}
					
				else
					System.out.println("Not same");
					
			}
	
		}
	
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter size 1st array:");
		//int size=sc.nextInt();
		//int a[]=new int[size];
		int a[]= {1,2,3};
		//System.out.println("Enter size 2nd array:");
		//int size2=sc.nextInt();
		//int b[]=new int[size2];
		int b[]= {1,2,3};
		
//		System.out.println("Enter 1st array elements: ");
//		for(int i=0;i<a.length;i++) 
//		{
//			a[i]=sc.nextInt();
//		}
//		System.out.println();
//		System.out.println("Enter 2nd array elements: ");
//		for(int i=0;i<b.length;i++) 
//		{
//			b[i]=sc.nextInt();
//		}
		/*
		 * if(a==b) { System.out.println("Both are same"); } else {
		 * System.out.println("Not same"); }
		 */
		
		
		Compair c=new Compair();
		c.comp(a, b);

	}

}
