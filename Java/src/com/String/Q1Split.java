package com.String;

import java.util.Arrays;

//1.	WAP to split string into 2 tokens where string is “HELLO$WORLD”

public class Q1Split {
	
	static void split(String str) 
	{

		String []split=str.split("\\$");
		
		for(String v: split) 
		{
			System.out.print(v+" ");
		}
	}

	public static void main(String[] args) 
	{
		String str="HELLO$WORLD";
		
		
		split(str);
	}

}
