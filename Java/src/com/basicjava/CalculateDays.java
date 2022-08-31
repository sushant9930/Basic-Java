package com.basicjava;

import java.util.Scanner;

public class CalculateDays {

	public static void main(String[] args) 
	{
    System.out.println(" Enter number of days :");
    
    Scanner sc=new Scanner(System.in);
    
    float day = sc.nextFloat();
    
    float year = day / 365;
    float week = day / 7;
    float month = day / 12;
    
    System.out.println(" Number of years :" +year);
    System.out.println(" Number of weeks :" +week);
    System.out.println(" Number of month :" +month);
    
	}

}
