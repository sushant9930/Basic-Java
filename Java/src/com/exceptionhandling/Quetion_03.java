package com.exceptionhandling;

/*
 3.	WAP to return int value in try block and return int value in 
 	finally block and observe which return takes precedence.
 */

public class Quetion_03 {

	public int m1()
	 {
	 try {
	   System.out.println("I am in try block");
	   return 30;
	  }
	finally {
	  System.out.println("I am in finally block");	
	  return 50;
	  }
	}
	public static void main(String[] args) 
	{
		Quetion_03 obj = new Quetion_03();
	   System.out.println(obj.m1());
	  }
}
