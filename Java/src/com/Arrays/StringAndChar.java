package com.Arrays;

public class StringAndChar {
	
	void showLength(String a[]) 
	{
		for(int i=0;i<=a.length-1;i++) 
		{
			System.out.println(a[i]+" - "+a.length);
		}
		
	}
	void reverseString(String a[]) 
	{
		System.out.println("string");
		for(int i=a.length-1;i>=0;i--) 
		{
			for(int j=a[i].length()-1;j>=0;j--) 
			{
				System.out.print(a[i].charAt(j));
			}
			System.out.println();
		}
	}

	void charsearch(char b[]) 
	{
		for(int i=0;i<b.length;i++) 
		{
		if (b[i]>='A' && b[i]<='Z')
			System.out.print((char)(b[i]+32)+" ");
		else if(b[i]>='a'&&b[i]<='z')
			System.out.print((char)(b[i]-32)+" ");
		else
			System.out.print("Not Alphabate");
			
		}
	}
	
	public static void main(String[] args) 
	{
		String a[]= {"Java","is","Good","Langauge"};
		char b[]= {'d','F','B','a','F'};

		StringAndChar s=new StringAndChar();
		s.showLength(a);
		s.reverseString(a);
		s.charsearch(b);
	}
	

	
	
}
