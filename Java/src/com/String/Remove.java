package com.String;

import java.util.Scanner;

public class Remove {
	
	static void remove1(String str, char ch) 
	{
		char d=' ';
		char temp;
		char str1[] = str.toCharArray();
		for(int i=0; i<str.length(); i++) 
		{
			
			if((char)ch == str.charAt(i) ) 
			{
				temp = str1[i];
				str1[i]=d;
				d=temp;
				
			}
			else 
			{
				System.out.print(str.charAt(i));
			}
		}
	}

	public static void main(String[] args) 
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		System.out.println(str+"\n");
		System.out.println("Enter word which you want to remove: ");
		char ch=sc.next().charAt(0);
		
		remove1(str,ch);
		
	}

}
