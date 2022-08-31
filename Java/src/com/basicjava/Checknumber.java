package com.basicjava;

import java.util.Scanner;

public class Checknumber {

	public static void main(String[] args) 
	{
    System.out.println("Please enter value :");
    Scanner sc=new Scanner (System.in);
    int value = sc.nextInt();
    
    if (value >= 0) 
    {
    	System.out.println("Value is positive");
    }
    else 
    {
    	System.out.println("Value is negative");
    }
	}

}
