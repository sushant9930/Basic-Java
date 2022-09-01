package com.Arrays;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Array length: "+a.length);
		
		System.out.println("Enter Elements in array:");
		for(int i=0;i<a.length;i++) 
		{
			a[i]=sc.nextInt();			
		}
		
		System.out.println("Reverse number of array:");
		for(int j=size-1;j>=0;j--) 
		{
			System.out.println(a[j]+" ");
		}
	}

}
