package com.Arrays;

public class AdditionOfOdd {

	public static void main(String[] args) 
	{
		int a[]= {2,5,3,6,10,8};
		System.out.println("Length of Array:"+a.length);
		
		System.out.println("Odd number addition:");
		int sum=0;
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]%2!=0) 
			{
				sum=sum+a[i];				
			}
			
		}
		System.out.println("Sum: "+sum);

	}

}
