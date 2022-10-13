package com.hashmap_02;

import java.util.Comparator;



public class Rating_01 implements Comparator<Clinic>
{
	@Override
	public int compare(Clinic c3, Clinic c4) 
	{
		return c3.getRating().compareTo(c4.getRating());
	}
}
