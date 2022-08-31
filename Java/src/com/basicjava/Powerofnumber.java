package com.basicjava;

import java.util.Scanner;

public class Powerofnumber {

	public static void main(String[] args) 
	{
		
	Scanner sc=new Scanner (System.in);
	System.out.println("enter number"+" ");
      int number = sc.nextInt();
      int n = sc.nextInt();
      
      long result = 1;
      
      
     // int powerofnumber = number * number * number;
    	 
       result *=  number ;
      
     
      System.out.println("Power of given number :" +result);
	}
	}
	
