package com.arraylist_02;

import java.util.Comparator;

public class BCollection implements Comparator<Movies_01>
{
	@Override
	public int compare(Movies_01 k, Movies_01 k1) 
	{
		return k.m_bcollection.compareTo(k1.m_bcollection);
	}

}
