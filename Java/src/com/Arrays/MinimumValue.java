package com.Arrays;

import java.util.Scanner;

public class MinimumValue {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Length of Array is: "+a.length);
		
		System.out.println("Put array elements:");
		for(int i=0;i<a.length;i++) 
		{
			a[i]=sc.nextInt();
		}
		
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
		}System.out.println("Maximum value of Array is: "+max);
		

		int min=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
				min=a[i];
		}System.out.println("Minimum value of Array is: "+min);
		
	}

}
