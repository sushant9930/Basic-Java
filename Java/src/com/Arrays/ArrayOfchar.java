package com.Arrays;

public class ArrayOfchar {

	public void convertCase(char a[]) 
	{
		for(int i=0;i<a.length;i++) 
		{
		if (a[i]>='A' && a[i]<='Z')
			System.out.print((char)(a[i]+32)+" ");
		else if(a[i]>='a'&&a[i]<='z')
			System.out.print((char)(a[i]-32)+" ");
		else
			System.out.print("Not Alphabate");
			
		}
	}
	
	public static void main(String[] args) 
	{

		char a[]= {'d','F','4','a','F'};
		
		ArrayOfchar c=new ArrayOfchar();
		c.convertCase(a);
	System.out.println();
		new ArrayOfchar().convertCase(a);
		
	}

}
