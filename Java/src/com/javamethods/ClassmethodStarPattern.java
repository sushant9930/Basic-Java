package com.javamethods;

import java.util.Scanner;

public class ClassmethodStarPattern {
	
	void pattern1(int r) 
	{  
		int i=1,j;
		
		for(;i<=r;i++)                         //     i=1                         i=2                      i=3
		{
			for(j=i;j<=r;j++)                  //     j=1,j=2,j=3,j=4,j=5(f)      j=2,j=3,j=4,j=5(f)       j=3,j=4,j=5(f)
			{
				System.out.print(" ");   
			}
			for(j=1;j<=i;j++)                  //     j=1,j=2(f)                   j=1,j=2,j=3(f)          j=1,j=2,j=3,j=4(f)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}	
void pattern2(int r) 
{  
int i=1,j;

for(i=r;i>=1;i--) 
{
	for(j=i;j<=r;j++) 
	{
		System.out.print(" ");
	}
	for(j=1;j<=i;j++) 
	{
		System.out.print("* ");
	}
	System.out.println();
}
}

void pattern3(int r) 
{  
int i=1,j;

for(i=r-1;i>=1;i--) 
{
	for(j=i;j<=r;j++) 
	{
		System.out.print(" ");
	}
	for(j=1;j<=i;j++) 
	{
		System.out.print("* ");
	}
	System.out.println();}}
void pattern4(int r) 
{  
	int i=1,j;

	for(i=i;i<=r;i++) 
	{	
		for(j=1;j<=i;j++) 
		{
			if (i%2==0) 
			{
				System.out.print("1");
			}
			else
			{
				System.out.print("0");
			}
		}
		System.out.println();
	}

}




	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ClassmethodStarPattern cm=new ClassmethodStarPattern();
		char cha;
		do {
		System.out.println("Enter how much row you want.....");
		int row=sc.nextInt();
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("Now look list.....");
		System.out.println("1: Pyramid ");
		System.out.println("2: Inverted Pyramid ");
		System.out.println("3: Pyramid Star Pattern ");	
		System.out.println("4: Even Odd pattern");
		System.out.println();
		System.out.println("Choose any above....it's your choice");
		int ch=sc.nextInt();
		switch(ch) 
		{
		case 1:			
		           	cm.pattern1(row);
		           	System.out.println();
		           	System.out.println("Thank You......");
		    break;
		case 2:
			        cm.pattern2(row);
			        System.out.println();
			        System.out.println("Thank You......");
           	break;
		case 3:	
           	             cm.pattern1(row);
			             cm.pattern3(row);
			             System.out.println();
			             System.out.println("Thank You......");
		    break;	
		case 4:			
           	           cm.pattern4(row);
           	           System.out.println();
                    	System.out.println("Thank You......");
           	break;
		default:
			System.out.println("Select correct entry..");
		}
		System.out.println();
		System.out.println("------------------------------------------------------------------------");
		System.out.println("You Want try agin please select from below.......");
		System.out.println("Y or y");
	    cha=sc.next().charAt(0);	
		 if (cha!='Y'||cha!='y') 
		    {
		    	System.out.println("Character Error.....!!");}
		 System.out.println();
	     if (cha!='Y'||cha!='y')
			{System.out.println("Please choose form below.......");
			System.out.println("Y or y");
		    cha=sc.next().charAt(0);	   }      
	     System.out.println();    
		}
		while(cha=='Y'||cha=='y');
		if (cha!='Y'||cha!='y')
		{
		    System.out.println();
		    System.out.println("You attend more than 2 chance...");
		    System.out.println("Now you exit from page.");
		    System.out.println("Thank you...The End.");
		    }
	}}

