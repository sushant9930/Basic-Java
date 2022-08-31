package com.basicjava;

import java.util.Scanner;

public class CentimeterToMeter {

	public static void main(String[] args) 
	{
		System.out.println("Enter length in centimeter :");
		
		Scanner sc=new Scanner (System.in);
		
		float lengthincentimeter = sc.nextFloat();
		float lengthinmeter = lengthincentimeter / 100;
		
		System.out.println("Lenght in meter :"+" " +lengthinmeter + 'm');
	}

}
