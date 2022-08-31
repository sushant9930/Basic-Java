package com.javaswitch;

import java.util.Scanner;

public class Week {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1: Day");
		System.out.println("2: Day");
		System.out.println("3: Day");
		System.out.println("4: Day");
		System.out.println("5: Day");
		System.out.println("6: Day");
		System.out.println("7: Day");
		System.out.println("Enter which day you want see betweek (1-7)");
		int day=sc.nextInt();
		
		switch(day) 
		{
		case 1:
			System.out.println("1- Monday");
		break;
		
		case 2:
			System.out.println("2- Tuesday");
		break;
		
		case 3:
			System.out.println("3- Wednesday");
		break;
		
		case 4:
			System.out.println("4- Thursday");
		break;
		
		case 5:
			System.out.println("5- Friday");
		break;
		
		case 6:
			System.out.println("6- Saturday");
		break;
		
		case 7:
			System.out.println("7- Sunday");
		break;
		
		default:
			if(day>7) 
			{
			System.out.println("Error day does not exist...");	
			}
		}
	}

}
