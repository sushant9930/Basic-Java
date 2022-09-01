package com.Arrays;

import java.util.*;

import java.util.Scanner;

public class Reserse {
	
	void reverse(int arr[]) 
	{
		int len=arr.length;
		
		for(int i=0;i<arr.length/2;i++) 
		{
		
			int temp=arr[i];
			arr[i]= arr[arr.length - i - 1];
			arr[arr.length - i - 1]=temp;
			
			
		}
		System.out.println("Reverse: ");
		System.out.println(Arrays.toString(arr));
	}
	

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		//int arr[]= {1,3,4,5,6,5,7,8};
		
		System.out.println("Enter elements:");
		for(int i=0;i<arr.length;i++) 
		{
			arr[i]=sc.nextInt();
		}
		
		Reserse r=new Reserse();
		r.reverse(arr);
		
	}

}
