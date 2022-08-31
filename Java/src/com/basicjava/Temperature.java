package com.basicjava;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) 
	{
		System.out.println("Enter temperature in celsius :");
		Scanner sc=new Scanner (System.in);
		
		float celsius = sc.nextFloat();
		
		float Fahrenheit = ( celsius*1.8f)+32;
		
		System.out.println("Convert Celsius into Fahrenheit :" +Fahrenheit);
		
	}

}
