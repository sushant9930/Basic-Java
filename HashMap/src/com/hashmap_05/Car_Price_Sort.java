package com.hashmap_05;

import java.util.Comparator;

public class Car_Price_Sort implements Comparator<Car>
{
	public int compare(Car c1, Car c2) 
	{
		return c1.getC_price().compareTo(c2.getC_price());
	}
}
