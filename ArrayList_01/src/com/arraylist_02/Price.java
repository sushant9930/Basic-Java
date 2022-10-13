package com.arraylist_02;

import java.util.Comparator;

public class Price implements Comparator<Item>
{

	@Override
	public int compare(Item o1, Item o2) {
		
		return o1.price.compareTo(o2.price);
	}

}
