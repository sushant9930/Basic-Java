package com.javamethods;

import java.util.Scanner;

public class NationalGame {
	
	void india() 
		{
		  String game1="Hockey";
		  System.out.println("National game of India is......");
		  System.out.println(game1);
		}

	void china() 
	{
	  String game1="Table Tennis";
	  System.out.println("National game of China is......");
	  System.out.println(game1);
	}
	void bangladesh() 
	{
	  String game1="Kabaddi";
	  System.out.println("National game of Bangladesh is......");
	  System.out.println(game1);
	}
	void italy() 
	{
	  String game1="Football";
	  System.out.println("National game of Italy is......");
	  System.out.println(game1);
	}
	void unitedStates() 
	{
	  String game1="Baseball";
	  System.out.println("National game of United States is......");
	  System.out.println(game1);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		NationalGame ng=new NationalGame();
		System.out.println("List of Country:");
		System.out.println("India");
		System.out.println("China");
		System.out.println("Bangladesh");
		System.out.println("Italy");
		System.out.println("United SStates");
		System.out.println();
		System.out.println("Choose from above.........");
		String ch=sc.next();
		
		switch(ch) 
		{
		case "India":
			ng.india();
			System.out.println("Thank you......:)");
			break;
		case "China":
			ng.china();
			System.out.println("Thank you......:)");
			break;
		case "Bangladesh":
			ng.bangladesh();
			System.out.println("Thank you......:)");
			break;
		case "Italy":
			ng.italy();
			System.out.println("Thank you......:)");
			break;
		case "United States":
			ng.unitedStates();
			System.out.println("Thank you......:)");
			break;
		default:
			System.out.println("Error......!!");
		}
		
	}



	
}
