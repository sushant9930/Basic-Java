package com.javaswitch;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your choice");
		char ch=sc.next().charAt(0);
		
		switch(ch) 
		{
		case 'A':
			System.out.println("This is Vowel.");
			break;
			
		case 'E':			 				
			System.out.println("This is Vowel.");
			break;
			
		case 'I':			 				
			System.out.println("This is Vowel.");
			break;
			
		case 'O':			 				
			System.out.println("This is Vowel.");
			break;
			
		case 'U':			 				
			System.out.println("This is Vowel.");
			break;
			
		default:
			System.out.println("This is Consonant");
			
		
			
		}
		

	}

}
