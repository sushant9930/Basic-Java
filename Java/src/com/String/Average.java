package com.String;

import java.util.Scanner;
/*
Q14
Write a program to find average of digits in string.
E.g. input string is “a5i9gfj4tabc” output: 6

not solve
*/
public class Average {
	static void average2(String str) 
	{
		
		int r=0,sum=0,count=0,sum1=0;
		char c[]=str.toCharArray();
		for(int i=0;i<c.length;i++ )                      //i=1      i=3      i=7     
		{
			
		//	char c=str.charAt(string);
			if(c[i]>='0' && c[i]<='9')                    //true     true     true
			{
				System.out.print(c[i]);
				sum+=(c[i]-48);                             //0+5=5    5+9=14   14+4=18
				count++;                                  //c=1
				
				
			}
			
		}
		int b=sum/count;
		System.out.println("\nsum: "+sum);
		System.out.println("count: "+count);
		System.out.println("Average of given String: "+b);
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=sc.nextLine();
		System.out.println("Display String: "+str+"\n");
		
	
		average2(str);
	}

}
