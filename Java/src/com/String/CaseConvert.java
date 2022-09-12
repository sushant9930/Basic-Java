package com.String;

import java.util.Scanner;

public class CaseConvert {

	static void covert(String str, char ch1) 
	{
		System.out.println("String after convert:");
		for(int i=0; i<str.length();i++) 
		{
			char ch=str.charAt(i);			
			if(ch==ch1 ) 
			{
				System.out.print((char)(ch1+32));
				//break;
			}
			
			  else 
			  { 
				  System.out.print(ch); 
			  }			 
		}	
		
	}	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=sc.nextLine();
		System.out.println("show your String: "+str);
		System.out.println();
		
		System.out.println("Enter Character:");
		char ch1=sc.next().charAt(0);
		
		CaseConvert cs=new CaseConvert();
		cs.covert(str,ch1);
		
		

	}

}
