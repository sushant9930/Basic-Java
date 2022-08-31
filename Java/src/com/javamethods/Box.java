package com.javamethods;

import java.util.Scanner;

public class Box 
{
	void volume(int length,int width, int height) 
	{
		int result=length*width*height;
		System.out.println("Volume of box is....."+result);
				
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Box b=new Box();
	System.out.println("Enter length:");
	int l=sc.nextInt();
	System.out.println("Enter Width:");
	int w=sc.nextInt();
	System.out.println("Enter Height:");
	int h=sc.nextInt();
		
		b.volume(l, w, h);
		
	}
	

}
