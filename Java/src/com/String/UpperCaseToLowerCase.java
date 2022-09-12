package com.String;

import java.util.Arrays;

	// Write a Java program to convert uppercase string to lowercase (without using string function)


public class UpperCaseToLowerCase {

	public static void main(String[] args) 
	{
		String str="All The Best";
		System.out.println("String: "+str);
		System.out.println();
		
		System.out.println("Convert into Char array: ");
		char ch[]=str.toCharArray();
		System.out.println(Arrays.toString(ch));
		System.out.println();
		
		System.out.println("Covert UpperCase to LowerCase:");
		for(int i=0;i<ch.length;i++) 
		{
			if(ch[i]>='A' && ch[i]<='Z') 
			{
				System.out.print((char)(ch[i]+32));
			}
			else
				System.out.print(ch[i]);
		}
	//	System.out.println(Arrays.toString(ch));
	}

}
