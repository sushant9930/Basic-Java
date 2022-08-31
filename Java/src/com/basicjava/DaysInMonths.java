package com.basicjava;

import java.util.Scanner;

public class DaysInMonths {

	public static void main(String[] args) 
	{
     Scanner sc=new Scanner (System.in);
     System.out.println("Please enter months number from 1 - 12(1=Jan to 12=Dec):");
     int months=sc.nextInt();
     
     if (months==1 || months==3 || months==5|| months==7 || months==8 || months==10 || months==12) 
     {
    	 System.out.println("Days in your selected months is ......31 Days");
     }
     else if (months==4 || months==6 || months== 9 || months==11) 
     {
    	 System.out.println("Days in your selected months is ......30 Days");
     }
     else if (months==2)
     {
    	 System.out.println("Days in your selected months is either 28 days or 29 days");
     }
     else 
     { 
         System.out.println("Please enter valid number between 1-12");	 
	}
	
     

}
	}
