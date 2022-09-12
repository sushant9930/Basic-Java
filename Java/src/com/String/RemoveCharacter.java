package com.String;

import java.util.Arrays;

//Q8. Write a Java program to remove first and last occurrence of a word from 
//string.

public class RemoveCharacter {

	public static void main(String[] args) 
	{
		String str="All the best";
		System.out.println("Befor removing first and last occurrence: "+str);
		
		System.out.println();
		System.out.println("After removing first and last occurrence: "+str.substring(1, str.length()-1));

		
	}

}
