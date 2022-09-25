package com.exceptionhandling;

import java.util.Arrays;
import java.util.Scanner;

public class NullPointer {
	
	void reverseString(String str) 
	{
		
		try 
			{
			char ch[]=str.toCharArray();
				for(int i=ch.length-1; i>=0;i--) 
				{
					System.out.print(str.charAt(i)+" ");					
				}
				System.out.println();
			}
			catch(NullPointerException e) 
			{
				System.out.println("Null value found.");
				System.out.println("Null input not allowed in reverse method.");
			}
			finally 
			{
				
				System.out.println("Exception Done\n");
			}
		
	}
	
	void checkLength(String str) 
	{
		System.out.println();
		int count=0;
		try 
		{
			for(int i=0; i<str.length(); i++) 
			{
				count++;
			}
			System.out.print("String Length: "+count);
			System.out.println();
		}
		catch(NullPointerException e) 
		{
			System.out.println("Null value found.");
			System.out.println("Null input not allowed in length method");
		}
		finally 
		{
			System.out.println("Exception Done\n");
		}
	}
	
	void sortString(String str) 
	{
		try 
		{
			char ch[]=str.toCharArray();
			for(int i=0; i<ch.length; i++) 
			{
				for(int j=0; j<ch.length-1; j++) 
				{
					if(ch[j]>ch[j+1]) 
					{
						char temp=ch[j];
						ch[j]=ch[j+1];
						ch[j+1]=temp;
					}
				}
			}
			System.out.println();
			System.out.println("Sort String:");
			System.out.println(Arrays.toString(ch));
		}
		catch(NullPointerException e) 
		{
			System.out.println("Null value found.");
			System.out.println("Null input not allowed in sort String");
		}
		finally 
		{
			System.out.println("Exception Done\n");
		}
		
	}
	
	

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String: ");
		String str=sc.nextLine();
		//String str=null;
		
		
		
		NullPointer n=new NullPointer();
		n.reverseString(str);
		n.checkLength(str);
		n.sortString(str);
		
	
	}

}
