package com.whileloop;

public class RaykorExample {
	
	static void sumNumber(int []arr) 
	{
		int sum=0;
		for(int i=0; i<arr.length; i++) 
		{
			if(arr[i]%2==0) 
			{
				arr[i]=1;
			}
			else if(arr[i]==5) 
			{
				arr[i]=5;
			}
			else 
			{
				arr[i]=3;
			}
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		
		int [] arr= {1,2,3,4,5};
		sumNumber(arr);
	}

}
