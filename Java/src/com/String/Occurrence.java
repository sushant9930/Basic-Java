package com.String;

import java.util.Scanner;

public class Occurrence {

	static void obb(String str) 
	{
		int cnt=0;
		char ch[]=str.toCharArray();
		for(int i=0; i<ch.length-1;i++) 
		{
			cnt=1;
			char c=ch[i];
			for(int j=i+1;j<ch.length;j++) 
			{
				
				if(ch[j]==c) 
				{
					cnt++;
					ch[j]='0';
				}
			}
			if(ch[i]!='0') 
			{
				System.out.println(c+" "+cnt);
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=sc.nextLine();
		
		obb(str);

	}

}
