package com.basicjava;

import java.util.Scanner;

public class HighestPlacement {

	public static void main(String[] args) 
	{
         System.out.println("SRV COLLEGE");
         Scanner sc=new Scanner(System.in);
         
         System.out.println("Enter the number of students placed department wise...");
         System.out.println("Enter how many student placed in CSE department.... ");
         int cse = sc.nextInt();
         System.out.println("Enter how many student placed in ECE department.... ");
         int ece = sc.nextInt();
         System.out.println("Enter how many student placed in MECH department.... ");
         int mech = sc.nextInt();
         
         if (cse<0 || ece<0||mech<0)
         {
        	 System.out.println("Input is Invalid");
         }
         else if (cse>ece && cse >mech ) 
         { 
        	 System.out.println("Highest Placement in CSE department");
         }
         else if (cse==ece && mech<cse ) {
         
        	 System.out.println("Highest Placement in CSE and ECE department");}
        		 
         
         else if(ece==mech && cse<mech) {
         
        	 System.out.println("Highest Placement in ECE and MECH department"); }
         
         else if (cse==mech && ece<cse) {
        
        	 System.out.println("Highest Placement in CSE and MECH department");}
         		 
         else if (ece>cse && ece>mech )
         {
        	 System.out.println("Highest Placement in ECE department");
         }
         else if (mech>cse && mech>ece)
         {
        	 System.out.println("Highest Placement in MECH department");
        	 }
         else if  (cse==0 && ece==0 && mech==0)
         {
        
        	 System.out.println("None of the department has got the highest placement");
         }  
         else if  (cse==ece && ece==mech)
         {
        
        	 System.out.println("None of the department has got the highest placement");
         }  
         
           }

}
