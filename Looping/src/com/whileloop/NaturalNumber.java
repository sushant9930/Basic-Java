package com.whileloop;
// Write a program to calculate the sum of first 10 natural number.
public class NaturalNumber {

	public static void main(String[] args) 
	{
		System.out.println("The first 10 natural number is: ");
		int i=1, sum=0;
		while(i<=10) 
		{
			sum=sum+i;
			System.out.print(i+" ");
		i++;
		}
		System.out.println("\nSum is: "+sum);

	}

}
