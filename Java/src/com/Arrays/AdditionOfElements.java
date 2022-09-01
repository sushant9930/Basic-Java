package com.Arrays;

import java.util.Scanner;

public class AdditionOfElements {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Length of array: "+a.length);

		System.out.println("Enter elements values: ");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
			}
		int sum=0;
		for(int i=0;i<size;i++)
		{
			sum=sum+a[i];			
		}
		System.out.println("Addition of array: "+sum);
	}

}
