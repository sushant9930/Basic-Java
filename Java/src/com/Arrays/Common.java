package com.Arrays;

import java.util.Scanner;

public class Common {
	boolean equalstoo;
	void search(int arr1[],int arr2[]/*,int size1,int size2*/) 
	{
		int count=0;
		if(arr1.length==arr2.length)// && arr1[i]==arr2[i] )              
		  {
			for(int i=0;i<arr1.length || i<arr2.length;i++) 
			{
					if(arr1[i]==arr2[i]) 
					{
						count++;
					}
					else 
					{
						System.out.println("Elements are different not equal");
					}	
			}
			if(count==arr1.length) 
			{
				System.out.println("Arrays are equal.");
			}
				
			}
		else 
		{
			System.out.println("Arrays length different not equal.");
		}
		
	}

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size 1st: ");
		int size=sc.nextInt();
		int arr1[]=new int[size];
		System.out.println("Enter size 2nd: ");
		int size2=sc.nextInt();
		int arr2[]=new int[size2];
		System.out.print("Total size of 1st array: "+arr1.length);
		System.out.print("Total size of 2nd array: "+arr2.length);
		System.out.println();
		System.out.println("Enter elements in 1st array:: ");
		for(int i=0;i<size;i++) 
		{
			arr1[i]=sc.nextInt();			
		}
		
		System.out.println("Enter elements in 2nd array:: ");
		for(int i=0;i<size2;i++) 
		{
			arr2[i]=sc.nextInt();			
		}
		
		
		Common c=new Common();
		c.search(arr1, arr2);
	}

}
