package com.arraylist_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.lang.*;

public class SearchMoviesDetailsMain {
	
	static void sortByRating(List<Movies_01> li) 
	{
		System.out.println("----------Sorting by rating-----------");
		Collections.sort(li, new Rating());
		Iterator <Movies_01> id2=li.iterator();
		while(id2.hasNext())
		{
			System.out.println(id2.next());
			
		}
		
	}
	
	static void greaterThan(List<Movies_01> li1) 
	{
		System.out.println("----------Rating greater than 7-----------");
		for(int i=0; i<li1.size(); i++) 
		{
			if(li1.get(i).m_rating<=7) 
			{
				li1.remove(i);
				i--;
			}
			
		}
		System.out.println(li1);
	}

	static void RRROnly(List<Movies_01> li2) 
	{
		System.out.println("-----------Only RRR Movie details Print-------------");
		for(int i=0; i<li2.size(); i++) 
		{
			if(li2.get(i).m_name.equals("RRR")) 
			{
				System.out.println(li2.get(i));
			}
		}
	}
	
	static void sortByBCollection(List<Movies_01> li3) 
	{
		System.out.println("---------Sorting by BoxOffice collection----------");
		Collections.sort(li3, new BCollection());
		Iterator <Movies_01> id4=li3.iterator();
		while(id4.hasNext()) 
		{
			System.out.println(id4.next());
		}
	}
	public static void main(String[] args) 
	{
		ArrayList<Movies_01> mm=new ArrayList<Movies_01>();
		
		Movies_01 m11=new Movies_01(121, 2500000, "Bahubali", 7f);
		Movies_01 m12=new Movies_01(122, 5000000, "RRR", 9f);
		Movies_01 m13=new Movies_01(123, 1000000, "Veer", 5f);
		Movies_01 m14=new Movies_01(125, 3000000, "Singham", 7f);
		Movies_01 m15=new Movies_01(124, 3500000, "Cutputli", 8f);
		
		mm.add(m11);
		mm.add(m12);
		mm.add(m13);
		mm.add(m14);
		mm.add(m15);
	
			sortByRating(mm);
			greaterThan(mm);
			RRROnly(mm);
			//sortByBCollection(mm);
	
		
	}

}
