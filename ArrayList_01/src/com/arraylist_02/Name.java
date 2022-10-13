package com.arraylist_02;

import java.util.Comparator;

public class Name implements Comparator<Movies_01> 
{
	
	@Override
	public int compare(Movies_01 o1, Movies_01 o2) 
	{
		return o1.m_name.compareTo(o2.m_name);
	}


}
