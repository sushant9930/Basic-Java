package com.String;

import java.util.Scanner;

public class Alphabets {
	
	static void print(String str) 
	{

		String str1[]=str.split(" ");
		
		for(int i=0; i<str1.length; i++)
		{
			int sum=0;
			char ch[]=str1[i].toCharArray();
			for(int j=0; j<str1[i].length(); j++) 
			{
					sum=sum+(ch[j]-64);			
			}
			System.out.println(str1[i]+" "+sum);
		}
		
	}

	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter String: ");
		//String str=sc.nextLine();
		String str="THE SKY IS THE LIMIT";
		
			
		print(str);
		
	}

}
