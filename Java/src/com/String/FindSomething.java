package com.String;

import java.util.Arrays;

public class FindSomething {

	public static void main(String[] args) 
	{
		String str="All The Best No 01";
		int vowel=0, consonant=0, spaces=0,digit=0;
		
		for(int i=0; i<str.length();i++) 
		{
			char ch=str.charAt(i);
			
			if((ch>='a'&&ch<='z') ||
				(ch >='A' && ch<= 'Z')) 
			{
				ch=Character.toLowerCase(ch);
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
					vowel++;
				else
					consonant++;
			}
			else if(ch>='0' && ch<='9')
				digit++;
			else
				spaces++;
		}
		
		System.out.println("Vowels: "+vowel);
		System.out.println("Consonant: "+consonant);
		System.out.println("Digit: "+digit);
		System.out.println("Space: "+spaces);
		
		
	}
	}


