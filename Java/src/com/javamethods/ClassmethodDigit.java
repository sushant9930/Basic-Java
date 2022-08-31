package com.javamethods;

import java.util.Scanner;

//Q2... Playing with numbers. 
public class ClassmethodDigit {
	int num;
	void reverse(int num) 
	{	int c=1,rev=0,r=0;
		while(num!=0) 
		{
			r=num%10;
			rev=rev*10+r;
			num/=10;			
		}System.out.println(rev);
	}
	void addition(int num) 
	{
		int c=1,sum=0,r=0;
		while(num!=0) 
		{
			r=num%10;
			sum=sum+r;
			num/=10;			
		}System.out.println(sum);
	}
	void multi(int num)
	{
		int c=1,mul=1,r=0;
		while(num!=0) 
		{
			r=num%10;          //25%10=5
			mul=mul*r;         //
			num/=10;			
		}System.out.println(mul);
	}	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ClassmethodDigit r=new ClassmethodDigit();
		System.out.println("Enter number first here:");
		int num1=sc.nextInt();
		System.out.println();
		System.out.println("LIST");
		System.out.println("1: Reverse");
		System.out.println("2: Addition");
		System.out.println("3: Multiplication");
		System.out.println("4: Reverse, Addition, Multiplication");
		System.out.println("Choose from above........");
		int ch=sc.nextInt();
		switch(ch) 
		{
		case 1:
			System.out.println("Reverse digit......");
			System.out.println("Your result is......");
		    r.reverse(num1);        	
		break;
		case 2:
			System.out.println("Addition of digit......");
			System.out.println("Your result is......");
		    r.addition(num1);        	
	    break;
		case 3:
			System.out.println("Multiplication of digit......");
			System.out.println("Your result is......");
		    r.multi(num1);        	
	    break;
		case 4:
			System.out.println("Reverse digit......");
			r.reverse(num1);		  
			System.out.println("Addition of digit......");
			r.addition(num1); 
			System.out.println("Multiplication of digit......");
		    r.multi(num1);        	
	    break;
	    default:
	    	System.out.println("Please select from above list....");		
		}
	}

}
