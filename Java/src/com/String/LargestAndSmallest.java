package com.String;

//Write a program to find out the largest and smallest length word in the string “This is an umbrella".


import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;
public class LargestAndSmallest {
	
	static void largest(String str) 
	{
		String s[]=str.split(" ");
		
		System.out.println(Arrays.toString(s));
		int i=0;
		String min=s[0];
		 for( ;i<s.length-1;i++) 
		 {
			 for(int j=i+1;j<s.length;j++) 
			{
				 if(s[i].length()>s[j].length() ) 
				 {
					 min=s[j];					 
				 }	
			
			}
		 }
		 System.out.println("Smallest word is: "+min);
		 
	}

	static void largest1(String str) 
	{
		char ch[]=str.toCharArray();
		String s[]=str.split(" ");
		String max=s[0];
		 for(int i=0;i<s.length-1; i++) 
		 {
			 for(int j=i+1;j<s.length;j++) 
				{
					 if(s[i].length()<s[j].length() ) 
					 {
						 max=s[j];						 
					 }					
				}
			
		 }
		 System.out.println("Largest word is: "+max);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter String:");
		//String str=sc.nextLine();
		
		String str="not so good";
		
		largest(str);
		largest1(str);

	}

}
