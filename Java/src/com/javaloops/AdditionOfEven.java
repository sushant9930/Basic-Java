package com.javaloops;

import java.util.Scanner;

public class AdditionOfEven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter limit");
		int limit= sc.nextInt();
		int sum=0;
		int c=1;
		while(c<=limit) 
		{
			if(c%2==0)
			sum+=c;
				
				
			c++;
		}
		System.out.println("Addition of even number is...."+sum);

	}

}
