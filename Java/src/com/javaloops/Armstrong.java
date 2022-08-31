package com.javaloops;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int r=0,count=0,product=1,res=0;
				
		int temp=num;
		
        while (temp!=0) 
		{
			r=temp%10;                          //r=153%10=3         15%10=5         1%10=1      0%10=0   temp!=0
			++count;                           //count 1             count=2       count=3			
			int power=count;
		        for(int i=1;i<=power;i++)    //  i=1              i=1                 i=3
			 	{product=product*r;         //1*3=3*3*3            1*5=5*5*5         1*1=1*1*1
			 	}
		        res=res+product;             //0+27=27             27+125=152           1+152=153
		  		temp=temp/10;                   //153/10=15        15/10=1                1/10=0
		}
       
	if (num==res) 
	{
		System.out.println(num+" is armstrong number.");
	}
	else 
	{
		System.out.println(num+" is not armstrong number.");
	}
			 
		}

	}


