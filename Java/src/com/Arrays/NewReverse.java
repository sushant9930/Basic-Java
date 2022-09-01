package com.Arrays;

import java.util.*;

import java.util.Scanner;

public class NewReverse {
	
	void newReverse(int a[]) 
	{
		int mid=a.length/2;
	for(int i=0;i<mid;i++) 
	{
		int temp=a[i];
		a[i]=a[a.length-i-1];
		a[a.length-i-1]=temp;
		
		
	}
	System.out.println("Reverse array:  ");
	System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size: ");
		int size=sc.nextInt();
		int a[]=new int[size];
		
		System.out.println("Enter elements:");
		for(int i=0;i<a.length;i++) 
		{
			a[i]=sc.nextInt();
		}
		
		NewReverse nr=new NewReverse();
		nr.newReverse(a);
	}

}
