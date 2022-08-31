package com.javaconstructor;

import java.util.Scanner;

public class Show {

	public static void main(String[] args) 
	{
		 Scanner sc=new Scanner(System.in);
		 BikeDetails bd=new BikeDetails();
		 System.out.println(BikeDetails.bikeBrand);
			System.out.println("List of Bike");
			System.out.println("1: Splender");
			System.out.println("2: Delux");
			System.out.println("3: Xtreme 200S");
			System.out.println("Choose bike from above... ");
			int b=sc.nextInt();
			bd.bike(b);
			
			System.out.println();
			System.out.println("Choose payment mode");
			System.out.println("1: One time payment ");
			System.out.println("2: Installment ");
			System.out.println("Choose from above....");
			int chh=sc.nextInt();
			bd.payment(chh);
			
			System.out.println();
			if(chh==2) 
			{System.out.println("You selected installment option...");
			System.out.println("Now choose installmen option as follow:");
			System.out.println("Installment in months");
			System.out.println("1");
			System.out.println("2");
			System.out.println("3");
			System.out.println("4: if select 4 months or more you not eligible for offer");
		    int op=sc.nextInt();
			bd.installment1(op);}
			else 
			{
				bd.cash();
			}
			
			System.out.println();
			System.out.println("Your bike details:");
			System.out.println();
			System.out.println(BikeDetails.bikeBrand);
			bd.choice(b);	
	}

}
