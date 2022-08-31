package com.javaswitch;

import java.util.Scanner;

public class DaysInMonths {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1:January");
		System.out.println("2:February");
		System.out.println("3:March");
		System.out.println("4:April");
		System.out.println("5:May");
		System.out.println("6:June");
		System.out.println("7:July");
		System.out.println("8:August");
		System.out.println("9:September");
		System.out.println("10:October");
		System.out.println("11:November");
		System.out.println("12:December");
		
		
		System.out.println("Plesae enter month....");
		int month=sc.nextInt();

				switch(month) 
				{
				case 1:
					System.out.println("You selected January...");
					System.out.println("31 days in this month");
					break;
					
				case 2:
					System.out.println("You selected Year...");
					int year=sc.nextInt();
					System.out.println("You selected February..."+year);
					if(year%4==0 && year%100!=0 || year%400==0) {
					System.out.println("This is leap year and in this year 29 days in February");}
					else 
					{
						System.out.println("This is common year and in this year 28 days in February");
						
					}
					break;
					
				case 3:
					System.out.println("You selected March...");
					System.out.println("31 days in this month");
					break;
					
				case 4:
					System.out.println("You selected April...");
					System.out.println("30 days in this month");
					break;
					
				case 5:
					System.out.println("You selected May...");
					System.out.println("31 days in this month");
					break;
					
				case 6:
					System.out.println("You selected June...");
					System.out.println("30 days in this month");
					break;
					
				case 7:
					System.out.println("You selected July...");
					System.out.println("31 days in this month");
					break;
					
				case 8:
					System.out.println("You selected August...");
					System.out.println("31 days in this month");
					break;
					
				case 9:
					System.out.println("You selected September...");
					System.out.println("30 days in this month");
					break;
					
				case 10:
					System.out.println("You selected October...");
					System.out.println("31 days in this month");
					break;
					
				case 11:
					System.out.println("You selected November...");
					System.out.println("30 days in this month");
					break;
					
				case 12:
					System.out.println("You selected December...");
					System.out.println("31 days in this month");
					break;
					
				default:
					System.out.println("Please select valid option..");
				}
	}

}
