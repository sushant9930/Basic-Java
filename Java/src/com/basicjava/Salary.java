package com.basicjava;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
	System.out.println("Basic salary of employees");
	 System.out.println("Please enter first employee Basic salary :");
     int employee1 = sc.nextInt();
     //System.out.println(employee1+"Rs.");
     System.out.println("Please enter second employee Basic salary :");
     int employee2 = sc.nextInt();
     //System.out.println(employee2+"Rs.");
     System.out.println("Please enter third employee Basic salary :");
     int employee3 = sc.nextInt();
     //System.out.println(employee3+"Rs.");
     
     System.out.println("Please enter first employee HRA in percentage");
     int per1=sc.nextInt();
     //System.out.println(per1 +"%");
     System.out.println("Please enter second employee HRA in percentage");
     int per2=sc.nextInt();
     //System.out.println(per2 +"%");
     System.out.println("Please enter third employee HRA in percentage");
     int per3=sc.nextInt();
     //System.out.println(per3 +"%");
     
     
     System.out.println("Please enter first employee DA in percentage");
     int daa1=sc.nextInt();
     //System.out.println(daa1 +"%");
     System.out.println("Please enter second employee DA in percentage");
     int daa2=sc.nextInt();
     //System.out.println(daa2 +"%");
     System.out.println("Please enter third employee DA in percentage");
     int daa3=sc.nextInt();
     //System.out.println(daa3 +"%");
     
     int hra1=employee1 * per1/100;
     int hra2=employee2 * per2/100;
     int hra3=employee3 * per3/100;
     
     int da1=employee1 * daa1/100;
     int da2=employee2 * daa2/100;
     int da3=employee3 * daa3/100;
     
     //gross salary
     int gross1= employee1 + hra1 + da1;
     int gross2= employee2 + hra2 + da2;
     int gross3= employee3 + hra3 + da3;
     
     System.out.println("Gross salary of first employee :");
     System.out.println("Basic Salary :"+" "+employee1+"Rs.");
     System.out.println("HRA :"+" "+hra1+"Rs.");
     System.out.println("DA"+" "+da1+"Rs.");
     System.out.println("Gross salary"+" "+gross1+"Rs.");
     
     System.out.println("Gross salary of second employee :");
     System.out.println("Basic Salary :"+" "+employee2+"Rs.");
     System.out.println("HRA :"+" "+hra2+"Rs.");
     System.out.println("DA"+" "+da2+"Rs.");
     System.out.println("Gross salary"+" "+gross2+"Rs.");
     
     System.out.println("Gross salary of third employee :");
     System.out.println("Basic Salary :"+" "+employee3+"Rs.");
     System.out.println("HRA :"+" "+hra3+"Rs.");
     System.out.println("DA"+" "+da3+"Rs.");
     System.out.println("Gross salary"+" "+gross3+"Rs.");
	}
   }