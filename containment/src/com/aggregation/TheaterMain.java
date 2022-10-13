package com.aggregation;

import java.util.Scanner;

public class TheaterMain {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number of Theater: ");
		int tno=sc.nextInt();
		Theater tt[]=new Theater[tno];
		for(int j=0; j<tt.length; j++) {
		
		System.out.println("Enter Id no. of theater: ");
		int tid=sc.nextInt();
		System.out.println("Enter name of Theater: ");
		String tname=sc.next();
		
		System.out.println("Enter how many movie in this theater: ");
		int mno=sc.nextInt();
		Movie m[]=new Movie[mno];
		for(int i=0; i<m.length; i++) 
		{
			System.out.println((i+1)+")");
			System.out.println("Enter movie id no.: ");
			int mid=sc.nextInt();
			System.out.println("Enter movie Name: ");
			String mname=sc.next();
			System.out.println("Enter BoxOffice collection: ");
			long collection=sc.nextLong();
			System.out.println("Enter release year: ");
			int year=sc.nextInt();
			
			Movie mm=new Movie();
			mm.setMid(mid);
			mm.setMname(mname);
			mm.setCollection(collection);
			mm.setYear(year);
			
		  m[i]=mm;
		}
		Theater t=new Theater();
		t.setTid(tid);
		t.setTname(tname);
		t.setM(m);
		
		tt[j]=t;
		}
		
		for(Theater t1:tt) 
		{
			System.out.println(t1);
			System.out.println();
		}
	}

}
