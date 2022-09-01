package com.arrayobject;

import java.util.Scanner;

public class MovieDisplay {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter count of movies: ");
		int size=sc.nextInt();
		Movie m[]=new Movie[size];
		
		for(int i=0;i<m.length;i++) {
		System.out.println("Enter Movie Id no.: ");
		int id=sc.nextInt();
		System.out.println("Enter Movie name: ");
		String name=sc.next();
		System.out.println("Enter movie box office collection: ");
		long bc=sc.nextLong();
		System.out.println("Enter director name: ");
		String pro=sc.next();
		System.out.println("Enter Release year: ");
		String release=sc.next();
		m[i]=new Movie(id,name,pro,bc,release);
		}
		for(Movie n:m) 
		{
		
			if(n.boxcollection>5000000 && n.director.equalsIgnoreCase("rajamouli")) 
			{
				System.out.println("\nMovie name: "+n.mname+
								   "\nBoxOffice Collection: "+n.boxcollection+
								   "\nMovie Director name: "+n.director+
								   "\nRelease year: "+n.releaseyear);
			}
		}
		}

}
