package com.basicjava;

import java.util.Scanner;

public class Divisible {

	public static void main(String[] args) 
	{
     System.out.println("Enter value :");
     Scanner sc =new Scanner(System.in);
     
     int value = sc.nextInt();
     float result = value % 5;
     
     
     if (result == 0) 
     {
    	 System.out.println("Given number disible by 5");
     }
     else
    	 System.out.println("Given number not divisible by 5");
	}

}
