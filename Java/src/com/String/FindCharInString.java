package com.String;
import java.util.*;
public class FindCharInString {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr String:");
		String str=sc.nextLine();
		System.out.println("Original String: "+str);
		System.out.println();
		
		System.out.println("Enter which character you want:");
		char c=sc.next().charAt(0);
		
		char ch[]=str.toCharArray();
		System.out.println("After String coverting into char Array: "+Arrays.toString(ch));
		System.out.println();
		int i=0, count=0;
		//ch=Character.toUpperCase(ch);
		for(;i<ch.length;i++) 
		{
			
			if(ch[i]==c ) 
			{
				count++;
				System.out.println(c+" present string at position "+i);
			}
			
		}
		System.out.println();
		System.out.println(c+" present in String "+count+" times");

	}

}
