package com.Arrays;

public class AdditionOfEven {

	public static void main(String[] args) 
	{
		int arr[]= {2,5,3,6,10,8};
		System.out.println("Length of array: "+arr.length);
		
		int sum=0;
		System.out.println("Addotion of even number:");
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i]%2==0) 
			{
				sum=sum+arr[i];
			}
		}
		System.out.println("Sum: "+sum);
		


	}

}
