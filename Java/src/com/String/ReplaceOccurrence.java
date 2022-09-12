package com.String;

import java.util.Scanner;
 //Q12. Write a Java program to replace first occurrence of a character with 
//another in a string (using string function
public class ReplaceOccurrence {
	public static void main(String[] args) 
	{		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=sc.nextLine();
		System.out.println("\ndisplay String:");
		System.out.println(str);
		System.out.println();
		
		System.out.println("Enter first occurrence of character refer by above String:");
		char ch1=sc.next().charAt(0);
		System.out.println("Enter replacement:");
		char ch=sc.next().charAt(0);
		
		
		System.out.println("Replace first occurence of character with another in String:");
		System.out.println(str.replace(ch1, ch));
		

	}

}
