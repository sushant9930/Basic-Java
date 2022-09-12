package com.String;
import java.util.*;
/*
Q13. Write a program that takes your full name as input and displays the 
abbreviations of the first and middle names except the last name which is 
displayed as it is. For example, if your name is Robert Brett Roser, then the 
output should be R.B.Roser.
*/

public class ShortName {

	static void replaceStr1(String str1) 
	{
		char c1[]=str1.toCharArray();
		for(int i=0; i<str1.length();i++) 
		{
			if(c1[0]>='a'&& c1[0]<='z')
			{
				System.out.print((char)(c1[0]-32)+".");	
				break;
			}	
			else if(c1[0]>='A'&& c1[0]<='Z') 
			{
				System.out.print((char)(c1[0])+".");
				
				break;
			}
		}
	}
    static void replaceStr2(String str2) 
	{
	  char c2[]=str2.toCharArray();
		for(int i=0; i<c2.length;i++) 
		{
			if(c2[0]>='a'&& c2[0]<='z')
			{
				System.out.print((char)(c2[0]-32)+".");
				
				break;
			}
			else if(c2[0]>='A'&& c2[0]<='Z') 
			{
				System.out.print((char)(c2[0])+".");
				
				break;
			}
		}
		
	}
	static void replaceStr3(String str3) 
	{
		char c3[]=str3.toCharArray();
		for(int i=0; i<c3.length;i++) 
		{
			
			if(c3[0]>='a'&& c3[0]<='z' && c3[i]==c3[0])
			{
				System.out.print((char)(c3[0]-32));
			}
			else if(c3[0]>='A'&& c3[0]<='Z' && c3[i]==c3[0]) 
			{
				System.out.print((char)(c3[0]));
			}
			else			
				System.out.print(c3[i]);		
		}	
		System.out.println(".");
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your first name:");
		String str1=sc.nextLine();
		System.out.println("Enter your middle name:");
		String str2=sc.nextLine();
		System.out.println("Enter your last name:");
		String str3=sc.nextLine();
		System.out.println("\nYour full name is: \n"+str1+" "+str2+" "+str3+". "+"\n");

		System.out.println("Display Name: ");
		replaceStr1(str1);
		replaceStr2(str2);
		replaceStr3(str3);

	}

	}


