package com.String;

public class Immutable {

	public static void main(String[] args) 
	{
		String str="Hello";
		System.out.println("String str befor concatination: "+str);
		String str1=str.concat("World");
		System.out.println("String str after concatination: "+str);		
		System.out.println("String str1: "+str1);

	}

}
