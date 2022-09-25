package com.exceptionhandling;

public class NumberFormat {
	
	private static final String inputString="123,33";

	public static void main(String[] args) 
	{
		try 
		{
			int a=Integer.parseInt(inputString);
		}
		catch(NumberFormatException e) 
		{
			System.out.println("Invalid String in argumment.");
		}

	}

}
