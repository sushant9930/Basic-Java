package com.whileloop;

import java.util.Arrays;

public class RemoveDuplicate {
	
	static void removeDuplicate(int [] a1, int [] a2, int [] a3 ) 
	{
		int count=0;
		for(int i=0; i<a1.length; i++) 
		{
			
				if(a1[i]!=a2[i]) 
				{
					a3[i]=a1[i];
					count++;
				}
		}
		
		for(int i=0; i<a2.length; i++) 
		{
			
				if(a1[i]!=a2[i]) 
				{
					
						a3[count+i]=a2[i];
					
				}
		}
		
		for(int i=0; i<a3.length; i++) 
		{
			if(a3[i]!=0) 
			{
				System.out.print(a3[i]+" ");
			}
		}
		
		//System.out.println(Arrays.toString(a3));
	}

	public static void main(String[] args) {
		
		int [] a1= {1,2,3,4,5,6};
		int [] a2= {7,8,9,10,11,6};
		int [] a3=new int[a1.length+a2.length];
		removeDuplicate(a1,a2,a3);
	}

}
