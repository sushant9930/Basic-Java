package com.Arrays;
import java.util.*;

public class ArrayMethods {
	
	void sumOfElements(int arr[], int size) 
	{
		System.out.println("Sum of arrays: ");
		int sum=0;
		for(int i=0;i<size;i++) 
		{
			sum=sum+arr[i];
		}
		System.out.println("Sum: "+sum);

		}
	void reverse(int arr[], int size) 
	{
		System.out.println("Reverse of Array:");
		for(int i=size-1;i>=0;i--) 
		{
			System.out.print(arr[i]+" ");
		}
	}
	void display(int arr[],int size) 
	{
		System.out.println();
		System.out.println("Show elements: ");
		
		System.out.print(Arrays.toString(arr));
		System.out.println();
		for(int a:arr) 
		{
			System.out.println(a);
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size here: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Length of array: "+arr.length);
		
		System.out.println("Enter elements: ");
		for(int i=0;i<size;i++) 
		{
			arr[i]=sc.nextInt();
		}
		
		ArrayMethods a=new ArrayMethods();
		a.sumOfElements(arr, size);
		a.reverse(arr, size);
		a.display(arr, size);
		
		
		

	}

}
