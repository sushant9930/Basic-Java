package com.arraylist_02;

import java.util.Comparator;

public class Name_01  implements Comparator<Item>
{
	@Override
	public int compare(Item o1, Item o2) 
	{
		return o1.item_name.compareTo(o2.item_name);
	}

}
