package com.basicjava;

import java.util.Scanner;

public class Salary1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
	System.out.println("Basic salary of employees");
	 float salary = sc.nextInt();
	 
	 float hra1 = salary * 0.2f;
	 float hra2 = salary *0.25f;
	 float hra3 = salary *0.3f;
	 
	 float da1 = salary * 0.8f;
	 float da2 = salary * 0.9f;
	 float da3 = salary * 0.95f;
	 
	 float Grosssalary = salary + hra1 +da1;
	 float Grosssalary2 = salary + hra2 +da2;
	 float Grosssalary3 = salary + hra3 +da3;
	 
	 
	 
     if (salary<=10000) 
     {
    	 
    	 System.out.println("Gross salary : "+Grosssalary);
    			 
     }
     else if (salary >=10000 && salary <=20000) 
     {
    	 System.out.println("Gross salary : "+Grosssalary2); 
     }
     else if (salary >=20000) 
     {
    	 System.out.println("Gross salary : "+Grosssalary3);
     }
     else 
     {
    	 System.out.println("not in system ");

	}

	}
	}
