package com.String;
import java.util.*;

//.Write a Java program to find reverse of a string(using function).
public class ReverseByUsingFunction {

	public static void main(String[] args) 
	{
		String str="Hello World";
		System.out.println("Befor reversing String: "+str);
		
		char ch[]=str.toCharArray();
				
		String str1[]=str.split(" ");
		System.out.println(Arrays.toString(str1));
		System.out.println();
		//reverse the words of s2
		for(int i=str1.length-1;i>=0;i--) 
		{
			System.out.print(str1[i]+" ");
		}

	}

}
