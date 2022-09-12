package com.String;

import java.util.Arrays;

	//Q7. Write a Java program to trim leading white space characters in a 
    //string.(using string function and without using string function)
public class TrimSpace {

	public static void main(String[] args) 
	{
		String str="All The Best";
		System.out.println("Before Trimming spaces: "+str);
		
		System.out.println("After trimming spaces: "+str.replace(" ", ""));
		

	}

}
