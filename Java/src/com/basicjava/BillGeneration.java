package com.basicjava;

import java.util.Scanner;

public class BillGeneration {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number of pizza:");
		float numberofpizza = sc.nextFloat();
		System.out.println("Enter number of puff:");
		float numberofpuff = sc.nextFloat();
		System.out.println("Enter number of cooldrink:");
		float numberofcooldrink = sc.nextFloat();
		
		int priceofpizza = 100;
		int priceofpuff = 20;
		int priceofcooldrink = 10;
		
		float priceofpizzas = numberofpizza * priceofpizza;
		float priceofpuffs = numberofpuff * priceofpuff;
		float priceofcooldrinks = numberofcooldrink * priceofcooldrink;
		
		float Totalbillprice = priceofpizzas + priceofpuffs + priceofcooldrinks;
		
		System.out.println(" Number of Pizza :" +numberofpizza);
		System.out.println(" Number of Puff :" +numberofpuff);
		System.out.println(" Number of cooldrink :" +numberofcooldrink);
		
		System.out.println(" Total Price :" +Totalbillprice);
		
	}

}
