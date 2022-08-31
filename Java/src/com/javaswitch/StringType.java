package com.javaswitch;

import java.util.Scanner;

public class StringType {

	public static void main(String[] args) {Scanner sc=new Scanner(System.in);
	
	System.out.println("One");
	System.out.println("Two");
	System.out.println("Three");
	System.out.println("Four");
	System.out.println("Five");
	System.out.println("Choose from above..");
	
	String day=sc.next();
	
	switch(day) 
	{
	case ("One"):
		System.out.println("Your ans is..1");
	break;
	
	case "Two":
		System.out.println("Your ans is...2");
	break;
	
	case "Three":
		System.out.println("Your ans is...3");
	break;
	
	case "Four":
		System.out.println("Your ans is...4");
	break;
	
	case "Five":
		System.out.println("Your ans is...5");
	break;
	
	default:
		System.out.println("Please value choice from above list");
	}

	}

}
