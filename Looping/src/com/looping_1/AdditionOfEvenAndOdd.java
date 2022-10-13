package com.looping_1;

import java.util.Scanner;

public class AdditionOfEvenAndOdd {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter limit where we stop: ");
		int limit = sc.nextInt();
		
		int c=1, sum=0, sum1=0;
		while(c<=limit) 
		{
			if(c%2==0) 
			{
				sum=sum+c;
			}
			else if(c%2!=0) 
			{
				sum1=sum1+c;
			}
			c++;
		}
		System.out.println("Sum of even number: "+sum);
		System.out.println("Sum of odd numbers: "+sum1 );
		
		int sum2 =0, sum3=0;
		for(int i=1;i<=limit;i++) {           //i=1				i=2				    	i=3 				i=4				i=5
			if(i%2==0) 						  //i%2==0 false	2%2==0 true				3%2==0 false		4%2==0 true		5%2==0 false
			{
				sum2 += i;										//sum2 = 0+2=2								sum2=2+4=6
			}
			else
			{
				sum3 = sum3+i;				//sum3=0+1 =1								//sum3=1+3=4						sum3=4+5=9
			}
			
		}
		System.out.println("Even num is" +sum2);
		System.out.println("Odd num is" +sum3);
		
	}

}
