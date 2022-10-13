package com.looping_1;

//Print the count of the given number


public class CountOfDigitInNumber {

	public static void main(String[] args) 
	{
		int n=1235, r=0, count=0;
		
		while(n>0) 
		{
			r=n%10;
			count++;
			n=n/10;
		}
		System.out.println("Count of digit: "+count);
		
	}

}
