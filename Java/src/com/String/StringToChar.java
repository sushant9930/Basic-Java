package com.String;

import java.util.Arrays;

public class StringToChar {

	public static void main(String[] args) 
	{
		String s1="Langauge";
		String s2="Java is a good programming langauge";
		
		System.out.println("Printing character using methods:");
		for(int i=0;i<s1.length();i++) 
		{
			System.out.print(s1.charAt(i)+" ");
		}
		System.out.println();
		
		System.out.println("Printing character without methods: ");
		char ch[]=s1.toCharArray();
		System.out.println(Arrays.toString(ch));
		System.out.println();
		
		
		// First split s2 String in Array with word wise
		String str[]=s2.split(" ");
		System.out.println(Arrays.toString(str));
		System.out.println();
		//reverse the words of s2
		for(int i=str.length-1;i>=0;i--) 
		{
			System.out.print(str[i]+" ");
		}

	}

}
