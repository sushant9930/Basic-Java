package com.hashmap_05;

import java.util.Comparator;

public class Car_Rating_Sort implements Comparator<Car>
{
	public int compare(Car c1, Car c2) 
	{
		return c1.getC_rating().compareTo(c2.getC_rating());
	}

}
