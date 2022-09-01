package com.Arrays;

import java.util.*;

import java.util.Scanner;

public class ArraySorting 
{
	public void sort(int arr[]) 
	{
		int len=arr.length;
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=0;j<arr.length-1;j++) 
			{
				if(arr[j]>arr[j+1]) 
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Secont highest number is: "+arr[len-2]);
		System.out.println("Second lowest number is: "+arr[1]);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		System.out.println("Enter elements:");
		for(int i=0;i<arr.length;i++) 
		{
			arr[i]=sc.nextInt();
		}
		

		ArraySorting as=new ArraySorting();
		as.sort(arr);
		
		
	}

}
