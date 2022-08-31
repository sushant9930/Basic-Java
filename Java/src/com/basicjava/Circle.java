package com.basicjava;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) 
	{
     System.out.println("Enter radius of circle :");
     
     Scanner sc=new Scanner (System.in);
     
     float radius = sc.nextFloat();
     
     float diameter = radius*2 ;
     float circumference = 2 * 3.14f * radius;
     float area = 3.14f * radius * radius;
     
     System.out.println("Diameter of circle :" +diameter);
     System.out.println("Diameter of circumference :" +circumference);
     System.out.println("Diameter of area :" +area);
	}

}
