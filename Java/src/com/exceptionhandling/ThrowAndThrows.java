package com.exceptionhandling;

public class ThrowAndThrows {

	public void example_01() 
	{
		int a=10, b=1,c;
		
			if(b==0) 
			{
				throw new ArithmeticException("Please check input is '0' in Example_01()");
			}
			c=a/b;
			
			System.out.println(c);
	}
	
	public void example_02() throws ArithmeticException
	{
		int a=10, b=0,c;
		
			if(b==0) 
			{
				throw new ArithmeticException("Please check input is '0' in Example_02()");
			}
			c=a/b;
			
			System.out.println(c);
	}
	
	
	public static void main(String[] args) 
	{
		ThrowAndThrows tt=new ThrowAndThrows();
		tt.example_01();
		
		try 
		{
			tt.example_02();
		}
		finally 
		{
			System.out.println("Exception done");
		}

	}

}
