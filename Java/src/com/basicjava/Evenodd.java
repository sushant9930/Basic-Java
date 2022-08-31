package com.basicjava;

import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) 
	{
     System.out.println("Please enter number :");
     Scanner sc=new Scanner (System.in);
     
     int number = sc.nextInt();
     int result = number %2;
     if (result<=0) 
     {
    	 System.out.println("even");
     }
     else
     {
    	 System.out.println("odd");
     }
	}

}
