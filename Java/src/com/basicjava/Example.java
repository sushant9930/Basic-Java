package com.basicjava;

/*  sub1 = 50/80, sub2 = 75/80, sub3 = 60/80   percentage */
/* 1st 100unit = 5rs per unit
 * 2nd 100 unit = 7rs per unit
 * after 200 unit = 10rs per unit
 * 174unit
 */

public class Example {

	public static void main(String[] args) 
	
	{
		/*float sub1=50;
		float sub2= 75;
		float sub3=60;
		float total = sub1+sub2+sub3;
		float acttotal= 80+80+80;
		
		float percentage= (total/240)*100;
		
		System.out.println("percentage....."+percentage);*/
		
		
		int unit1 = 185;
		int unit=unit1-100;
		int unit2=unit1-200;
		
		if (unit1>100 && unit1<200) 
		{
         int price = 5;//5rs per unit
         int price4=7; //7rs per unit
         int price5=10;//10rs per unit
         
         float price2=100*price;
         float price3= unit*price4;
         System.out.println("total price...."+(price2+price3));
		
	
		
	}

	}
	}
