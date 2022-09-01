package com.Arrays;

public class Negative {
	
	void count(int arr[]) 
	{
		int cont=0;
		System.out.println();
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i]<=0) 
			{
				cont++;
			}
			
		}
		System.out.println("Count of negative number is: "+cont);
	}
	
	void replace(int arr[]) 
	{
	 
		System.out.println();
		System.out.println("Negative number replace: ");
		for(int i=0; i<arr.length;i++) 
		{
			if (arr[i]<=0) 
			{
				arr[i]=arr[i-1]*arr[i-1];
			}			
			System.out.print(arr[i]+" ");
		}	
	}

	public static void main(String[] args) 
	{
		int arr[]= {8,-10,54,-6,4,-3,7,2,-4};
		System.out.println("Length of Array: "+arr.length);
		
		Negative n=new Negative();
		n.count(arr);
		n.replace(arr);

	}

}
