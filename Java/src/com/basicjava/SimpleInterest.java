package com.basicjava;

public class SimpleInterest {

	public static void main(String[] args) 
	{
		int P = 50000;    // Principle amount
		int R = 5;        // Rate of interest per 
		int T = 3;        // Time in years 
		
		int SI = (P*R*T)/100;         // Simple interest formula 
		
		System.out.println("Simple intrest:" +SI);

	}

}
