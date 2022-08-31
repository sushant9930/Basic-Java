package com.javaswitch;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter your number");
		System.out.println("1: Addition");
		System.out.println("2: Subtraction");
		System.out.println("3: Multiplication");
		System.out.println("4: Division");
		
		System.out.println("Please enter your choice");
		int a,b;
		int num=sc.nextInt();
		switch(num) {
		
		case 1:
		System.out.println("Enter your frist number ");
		a= sc.nextInt();
		System.out.println("Enter your second number ");	    
		b=sc.nextInt();
	    System.out.println("Addition is.."+(a+b));
		break;
		
		case 2:
		System.out.println("Enter your frist number ");
		a= sc.nextInt();
	    System.out.println("Enter your second number ");	    
		b=sc.nextInt();
	    System.out.println("Substraction is.."+(a-b));
		break;
		
		case 3:
		System.out.println("Enter your frist number ");
		a= sc.nextInt();
		System.out.println("Enter your second number ");
	    b=sc.nextInt();
		System.out.println("Multiplication is.."+(a*b));
		break;
		
		case 4:
		System.out.println("Enter your frist number ");
		a= sc.nextInt();
		System.out.println("Enter your second number ");
		//System.out.println("but don't enter '0' ");
		b=sc.nextInt();
		if (b==0) 
		{
			System.out.println("Denominator cannot be '0' enter valid number");
			System.out.println("Enter valid number");
			b=sc.nextInt();		}
		
		System.out.println("Division is.."+(a/b));
		break;
	
	    default:
	    System.out.println("Enter valid number");
		}

	}

}
