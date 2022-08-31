
package com.javaloops;
import java.util.*;
public class Frequency {

	public static void main(String[] args) 
	{
		       Scanner sc = new Scanner(System.in);
		        
		       int n,p,dig,i,digit,count=0;
		        
		       System.out.println("Enter Number");
		       n = sc.nextInt();
		        
		        p=n;
		        
		        System.out.println("Enter Digit whose frequency is required");
		        digit = sc.nextInt();
		        
		        while(p>0)
		        {
		            dig = p%10;
		            if(dig==digit)
		            {
		                count++;
		            }
		            p=p/10;
		        }
		        System.out.println("Original Number : "+n);
		        System.out.println("Frequency of "+digit+" is : "+count);
		    
		}

	}


