package com.whileloop;

import java.util.Arrays;

public class FizzBuzz {
	
	static void fizzbuzz(int [] a) 
	{
		for(int i=0; i<a.length; i++) 
		{
			if(a[i]%3==0) 
			{
				System.out.print("Fizz ");
			}
			else if(a[i]%5==0) 
			{
				System.out.print("Buzz ");
			}
			else if(a[i]%3==0 && a[i]%5==0) 
			{
				System.out.print("FizzBuzz ");
			}
			else 
			{
				System.out.print(a[i]+" ");
			}
		}
		
	}

	public static void main(String[] args) {
		
		int [] arr= {1,2,3,4,5,6,7,8,9};
		fizzbuzz(arr);
		
		
	}

}
