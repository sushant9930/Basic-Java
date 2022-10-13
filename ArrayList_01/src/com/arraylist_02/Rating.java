package com.arraylist_02;

import java.util.Comparator;

public class Rating implements Comparator<Movies_01>
{
	public int compare(Movies_01 o1, Movies_01 o2) 
	{
		return o1.m_rating.compareTo(o2.m_rating);
	}

}
