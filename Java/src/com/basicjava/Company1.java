package com.basicjava;

import java.util.Scanner;

public class Company1 {

	public static void main(String[] args) 
	{
       System.out.println("Micky software solution");
       Scanner sc=new Scanner(System.in);
       System.out.println("Please enter how many hours you work in one single day......");
       int hour=sc.nextInt();
       
       int hour3=hour*365;
       int hour4=hour3*100;
       if (hour>0) 
       {
       System.out.println("You earn in year is......"+hour4);
       }
       else 
       {
    	   System.out.println("Unable to calculate the earnings");
	}

}
	}
