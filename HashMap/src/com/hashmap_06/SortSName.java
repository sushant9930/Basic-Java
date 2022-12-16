package com.hashmap_06;

import java.util.Comparator;

public class SortSName implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.getSid().compareTo(o2.getSid());
	}

}
