package com.Arrays;

import java.util.Scanner;

public class Average {
	
	void Average(int a[],int size) 
	{
		int sum=0;
		for(int i=0;i<size;i++) 
		{
			sum=sum+a[i];
		}		
		float avg=sum/size;
		System.out.println("Average value of Array elements: "+avg);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter elements:");
		for(int i=0;i<size;i++) 
		{
			a[i]=sc.nextInt();
		}
		
		Average aa=new Average();
		aa.Average(a, size);

	}

}
