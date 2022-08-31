package com.basicjava;

import java.util.Scanner;

public class Areaofequilateraltriangle {

	public static void main(String[] args) 
	{
	System.out.println("Enter value of side (a) :");
	Scanner sc=new Scanner (System.in);
	
    float side = sc.nextFloat();
    
    float area = 0.4330127018922f * side *side;
    
    System.out.println("Area of equilateral triangle :" +area);
	}

}
