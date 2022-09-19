package com.exceptionhandling;
/*
2.	WAP to catch multiple exceptions. 
    I.e.ArrayIndexOutOfBoundsException and ArithmeticException 
	and NullPointerException.
*/
public class Quetion_02 {

	public static void main(String[] args) 
	{
		Quetion_02 n = null;
		String str = null;
		int arr[] = {1,2,1,2,1,2,1,2,1,2,1};
		int a = 10 ,b = 1;
		try 
		{
			System.out.println("Division: "+(a/b));
			System.out.println(arr[20]);
			n.toString();			
		}
		catch(ArrayIndexOutOfBoundsException e) 
		{
			e.printStackTrace();
		}
		catch(ArithmeticException e) 
		{
			e.printStackTrace();
		}
		catch(NullPointerException e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			System.out.println("done");
		}

	}

}
