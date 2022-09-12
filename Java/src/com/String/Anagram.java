package com.String;

import java.util.Arrays;
import java.util.Scanner;


// using sort fuction
public class Anagram {
	
	static void search(String str1, String str2) 
	{
	if(str1.length() == str2.length()) 
	{	
		char ch[]=str1.toCharArray();
		char ch1[]=str2.toCharArray();
		
		Arrays.sort(ch);
		Arrays.sort(ch1);
		/*
		  System.out.println(ch); 
		  System.out.println(ch1);
		 */
	int count=0;
	for(int i=0;i<ch.length;i++) 
	{
			if(ch[i]!=ch1[i] ) 
			{
					break;
			}
			else
			{			{
				count++;
			}
		}
		}
	if(count==ch.length) 
	{
	System.out.println("This anagram");
	}
	else
	{
		System.out.println("This is not anagram");
	}
		
	}
	else 
	{
		System.out.println("This is not anagram");
	}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st String:");
		String str1=sc.nextLine();
		System.out.println("Enter 2nd String:");
		String str2=sc.nextLine();
		
		
		search(str1, str2);
	}

}
