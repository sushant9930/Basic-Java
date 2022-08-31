package com.javamethods;

import java.util.Scanner;

public class ClassmethodFibonacci {
	
	void fibonacci(int limit) 
	{
		int a=0,b=1;
		System.out.println("Result.........");
	for(int i=1;i<=limit;i++) {
		int c=a+b;            
		
		b=a;
		a=c;
		
		System.out.println(b);
	}
	}
              public static void main(String[] arg) 
              { 
            	  char ch;
            	  do {
            	  Scanner sc=new Scanner(System.in);
                System.out.println("Enter Limit:");
                int limit1=sc.nextInt();
            	  ClassmethodFibonacci fb=new ClassmethodFibonacci ();
            	  
            	  fb.fibonacci(limit1);
            	  System.out.println("Do you want to check again...");
            	  System.out.println("Y or y for 'YES'");
            	  System.out.println("N or n for 'NO'");
            	  ch = sc.next().charAt(0);
            	  if (ch=='N' || ch =='n') 
            	  {
            		  System.out.println("Thanks for Visit.");
            		  System.out.println("Thank you......:)");
            	  }
            	
      		  
            	  }while(ch=='Y' || ch =='y');
            	 
            	
              }}
