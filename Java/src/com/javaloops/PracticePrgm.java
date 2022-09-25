package com.javaloops;
import java.util.*;

public class PracticePrgm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num= sc.nextInt();
		int r =0, sum =0, count=0, product=1,rev=0;
		while (num > 0) 
		{
			r = num % 10;
			sum = sum +r;
			product = product*r;
			rev = (rev*10)+r;
			count++;
			num = num/10;
			
		}
		System.out.println("Sum : "+sum);
		System.out.println("Count : "+count);
		System.out.println("Product : "+product);
		System.out.println("Reverse : "+rev);
	
	}
	
	
	
	
	

}
