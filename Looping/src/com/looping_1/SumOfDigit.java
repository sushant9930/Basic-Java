package com.looping_1;

import java.util.Scanner;

// Find the Sum of the digit
/*
  Input: 
  num = 1234
  1 + 2 + 3 + 4 
 Output:
 
 10
 
 */
public class SumOfDigit {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = s.nextInt();
		
		int r=0, sum=0, count=0, product=1, rev = 0;
		
		while(n > 0)                               
		{
			r = n % 10;                   // r = 1234 % 10  = 4           r = 123 % 10 = 3      r = 12 % 10 = 2    r = 1 % 10 = 1
 			sum=sum+r;                // sum = 0 + 4 = 4;             sum = 4 + 3 = 7       sum = 7 + 2 = 9    sum = 9 + 1 = 10
 			product=product*r;
 			rev = (rev*10)+r;
 			count++;
			n = n/10;                     // n = 1234 / 10 = 123          n = 123 / 10 = 12     n = 12 / 10 = 1    n = 1 / 10 = 0
			
		}
		System.out.println("Sum: "+sum);
		System.out.println("Count: "+count);
		System.out.println("Product of num: "+product);
		System.out.println("Reverse: "+rev);
		
		

	}

}
