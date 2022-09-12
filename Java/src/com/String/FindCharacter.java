package com.String;


//2.	Write a Java program to find total number of alphabets, digits or special character in a string.
public class FindCharacter {
	
	static void find(String str) 
	{
		int alphabets=0, digit=0, specialcaracter=0;
		for(int i=0; i<str.length(); i++) 
		{
			char s=str.charAt(i);
			if(s>='A' && s<='Z' || 
					str.charAt(i)>='a' && str.charAt(i)<='z' ) 
			{
				alphabets++;
			}
			else if(s>='0' && s<='9') 
			{
				digit++;
			}
			else 
			{
				specialcaracter++;
			}
		}
		System.out.println("Alphabets in String: "+alphabets);
		System.out.println("Digits in String are: "+digit);
		System.out.println("Special character in String: "+specialcaracter);
	}

	public static void main(String[] args) 
	{
		String str="Ab@c5dE%F9G";
		find(str);
	}

}
