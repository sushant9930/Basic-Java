package com.basicjava;

import java.util.Scanner;

public class Calculatr {

	public static void main(String[] args) 
{ Scanner sc=new Scanner(System.in);
		System.out.println("plrase entera first numebr....");
		double a = sc.nextDouble();
		System.out.println("Please enter second number..... ");
		double b = sc.nextDouble();
		System.out.println("Enter operators (1 - 4)...");
		int operator =sc.nextInt();
	
	if (operator == 1) {
		double c = a+b;
		System.out.println("your result..."+c);
	}
	else if (operator == 2) {
		double c1 = a-b;
		System.out.println("your result..."+c1);}
	else if (operator == 3) {
		double c2 = a*b;
		System.out.println("your result..."+c2);}
		else if (operator == 4) {
		double c3 = a/b;
			System.out.println("your result..."+c3);
	}
	else 
	{
		System.out.println("Please enter valid operator");
	}
}
}