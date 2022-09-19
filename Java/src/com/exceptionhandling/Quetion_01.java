package com.exceptionhandling;

/*
 	1.	WAP to show the scenario in which IndexOutBound Exception 
 		(Both ArrayInexOutOfBound and StringIndexOutOfBound)
 	 	exception is generated and handle this exception.  
*/
public class Quetion_01 {

	public static void main(String[] args) 
	{
		String str = "Sushant";
		
		try 
		{
			
			int count = 0;
			char c[] = str.toCharArray();
			for(int i = 0; i < str.length()+2;  i++) 
			{
				for(int j = i+1; j < c.length+1; j++) 
				{
					if( c[i] == c[j] ) 
					{
						count++;
					}
				}	
			}
			if(count > c.length) 
			{
				System.out.println("Hello");
			}
		}
		catch(ArrayIndexOutOfBoundsException  e) 
		{
			e.printStackTrace();
		}
		catch(StringIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		
		finally 
		{
			System.out.println("hello");
		}

	}

}
