package com.arraylist_03;
import java.util.*;
public class Location_01 implements Comparator<Clinic>
{
	@Override
	public int compare(Clinic c1, Clinic c2) 
	{
		return c1.getLocation().compareTo(c2.getLocation());
	}

}
