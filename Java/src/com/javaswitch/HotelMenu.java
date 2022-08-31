package com.javaswitch;

import java.util.Scanner;

public class HotelMenu {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1: Maharashtrian Thali");
		System.out.println("2: Gujrati Thali");
		System.out.println("3: Rajasthani Thali");
		System.out.println("4: Punjabi Thali");
		System.out.println("5: South indian dishes ");
		
		System.out.println("Which Thali/Dish you want please select.....");
		int choice=sc.nextInt();
		
	switch(choice) 
	{
	case 1:
		int price=120; //120rs per thali.
		System.out.println("Please enter your quantity...");
		int qty=sc.nextInt();
		System.out.println("You selcted Maharashtrian Thali ");
		System.out.println("Total Price is...."+(price*qty));
		break;
	
	case 2:
		int price1=220; //220rs per thali.
		System.out.println("Please enter your quantity...");
		int qty1=sc.nextInt();
		System.out.println("You selcted Gujrati Thali ");
		System.out.println("Total Price is...."+(price1*qty1));
		break;
		
	case 3:
		int price2=200; //200rs per thali.
		System.out.println("Please enter your quantity...");
		int qty2=sc.nextInt();
		System.out.println("You selcted Rajasthani Thali ");
		System.out.println("Total Price is...."+(price2*qty2));
		break;
		
	case 4:
		int price3=250; //250rs per thali.
		System.out.println("Please enter your quantity...");
		int qty3=sc.nextInt();
		System.out.println("You selcted Punjabi Thali ");
		System.out.println("Total Price is...."+(price3*qty3));
		break;
		
	case 5:
		int price4=100; //100rs per thali.
		System.out.println("Please enter your quantity...");
		int qty4=sc.nextInt();
		System.out.println("You selcted South indian dishes ");
		System.out.println("Total Price is...."+(price4*qty4));
		break;
	
	default:
		System.out.println("Please select from Menucard...");
	}
		
		System.out.println("Thanks for visit....");

	}

}
