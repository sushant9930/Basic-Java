package com.String;

import java.util.Scanner;

public class SubString {
	
	static void print(String str, int n, int n1) 
	{
		char ch[]=str.toCharArray();
		char ch1[]=new char[n1-n+1];
		int j=0;
		for(int i=n;i<=n1-1;i++) 
		{
			ch1[j]=ch[i];                //j= i=l
			j++;
		}
		String substr=new String(ch1);
		System.out.println("Ater removing start and end occurrence of original String: "+substr);
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=sc.nextLine();
		
		int n=1;
		int n1=str.length()-1;
		System.out.println();
		System.out.println("Length of String: "+str.length());
		System.out.println();
		
		
		print(str,n,n1);
		
		
	}

}
