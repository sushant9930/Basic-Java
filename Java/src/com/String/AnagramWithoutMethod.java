package com.String;

import java.util.Arrays;

public class AnagramWithoutMethod {
	
	static void search(String str1, String str2) 
	{
		if(str1.length() == str2.length()) 
		{
			char c1[]=str1.toCharArray();
			char ch2[]=str2.toCharArray();
			
			// sort first
			// For sorting
			Arrays.sort(c1);
			for(int i=0;i<ch2.length;i++) 
			{
				for(int j=0;j<ch2.length-1;j++) 
				{
					if(ch2[j]>ch2[j+1]) 
					{
					char temp=ch2[j];
						ch2[j]=ch2[j+1];
						ch2[j+1]=temp;
					}
				}
			}
				
			System.out.println(Arrays.toString(ch2));
			System.out.println(Arrays.toString(c1));
			
			//Compare
			int count=0;
			for(int k=0;k<c1.length;k++) 
			{
				if(c1[k]==ch2[k]) 
				{
					count++;
				}
				else 
				{
					break;
				}
			}
			if(count==c1.length) 
			{
				System.out.println("This is anagram");
			}
			else 
			{
				System.out.println("This is not anagram");
			}
			
			
		
	}
		else 
		{
			System.out.println("This is not anagram");
		}
	}
	public static void main(String[] args) 
	{
		String str1="Sushant";
		String str2="suShatn";

		search(str1,str2);
	}

}
