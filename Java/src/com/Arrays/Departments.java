package com.Arrays;

import java.util.Scanner;

public class Departments 
{
	

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Student count: ");
		int size=sc.nextInt();
		int s[]=new int[size];
		System.out.println("Total count of Students: "+s.length);
		System.out.println();
		System.out.print("Student Id no.:: ");
		for(int i=1;i<=size;i++) 
		{
			System.out.print(i+" ");			
		}
		

	}

}
