package com.exceptionhandling;

public class ReturnInt {
	
	public int trial_01() 
	{
	try {
	
		System.out.println("I am in try block\n");
		return 50;
	}
	
	finally 
	{
		System.out.println("I am in finally block.");
		return 20;
	}
	}
	public static void main(String[] args) 
	{
		ReturnInt r=new ReturnInt();
		System.out.println(r.trial_01());

	}

}
