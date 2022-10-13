package com.whileloop;

import java.util.Scanner;

public class PlindromBetweenTwoNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a start point: ");
		int n1=sc.nextInt();
		System.out.println("Enter a end point: ");
		int n2=sc.nextInt();
		
		
		//for(int i=n1; i<=n2; i++)
		//{
		int i=n1;
		while(i<=n2) {
			int a=i;
			int r=0, rev=0;
			while(a>0) 
			{
				r=a%10;
				rev=(rev*10)+r;
				a/=10;
			}
			if(rev==i) 
			{
				System.out.println(i);
			}
			i++;
			
	
		}
		
		
	}

}
