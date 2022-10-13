package com.pattern_01;
/*
 
0	1 2 3 4 5
1	2 3 4 5
2	3 4 5
3	4 5
4	5
4	4 5
3	3 4 5
2	2 3 4 5
1	1 2 3 4 5




*/
public class Pattern_16 {

	public static void main(String[] args) 
	{
		int n=5;
		for(int i=0; i<n; i++) 
		{
			for(int j=i+1; j<=n; j++) 
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=(n-1); i>0; i--) 
		{
			for(int j=i; j<=n; j++) 
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
