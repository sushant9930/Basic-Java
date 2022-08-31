package com.basicjava;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) 
	{
 System.out.println("Enter any character.......");
 System.out.println("Enter only capital character.");
	Scanner sc = new Scanner (System.in);
	char ch=sc.next().charAt(0);
	
	if (ch=='A' || ch=='E' || ch=='I' ||ch=='O' ||ch=='U') 
	{
	System.out.println("Given  is Vowel");
	}
	else 
	{
		System.out.println("This consonant");
		}
}}