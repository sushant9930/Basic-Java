package com.Arrays;

import java.util.Scanner;

public class EvenAndOdd {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		/*System.out.println("Enter size of array:");
		int size=sc.nextInt();*/
		int a[]= {2,10,5,7,9,6};
		
		
		System.out.println("Even number: ");
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]%2==0) 
			{
				System.out.print(a[i]+" ");
			}
		}
		System.out.println();
		System.out.println("Odd number:");
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]%2!=0) 
			{
				System.out.print(a[i]+" ");
			}
		}

	}

}
