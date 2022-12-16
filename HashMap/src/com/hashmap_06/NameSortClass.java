package com.hashmap_06;

import java.util.Comparator;
public class NameSortClass implements Comparator<Class>
{

	@Override
	public int compare(Class o1, Class o2) {
		
		return o1.getClassname().compareTo(o2.getClassname());
	}

}
