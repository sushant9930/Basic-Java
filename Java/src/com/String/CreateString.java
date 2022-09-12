package com.String;

public class CreateString {

	public static void main(String[] args) 
	{
		System.out.println("String literal");
		//String literal
		String str="Hello";
		String str1="Hello";
		
		System.out.println(str==str1);

		System.out.println();
		System.out.println("By using new keyword");
		//By using new keyword
		String str2=new String("Hello") ;
		String str3=new String("Hello");
		
		System.out.println(str2==str3);
	}

}
