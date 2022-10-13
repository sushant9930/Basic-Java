package com.looping_1;

// To print the palindrome available between 0 to 100
public class PalindromeBetween01To100 {

	public static void main(String[] args) 
	{
		for(int n=1; n<=100; n++) 
		{
			int a, r=0, rev=0;
			a=n;
			while(a>0) 
			{
				r=a%10;
				rev=(rev*10)+r;
				a=a/10;								
			}
			if(n == rev) 
			{
				System.out.println(n);
			}
		}

	}

}
