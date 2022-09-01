package com.Arrays;

import java.util.Scanner;

public class ShowArray {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int size=sc.nextInt();
		
		int array[]=new int[size];
		System.out.println("Length of Array: "+array.length);
		
		System.out.println("Enter values of arrays:");
		for(int i=0;i<array.length;i++) 
		{
			array[i]=sc.nextInt();
		}
		
		System.out.println("Show array elements:");
		for(int i=0;i<array.length;i++) 
		{
			System.out.print(array[i]+" ");
		}

	}

}
