package com.hashmap_05;
import java.util.Comparator;

public class Car_Name_Sort implements Comparator<Car>
{
	public int compare(Car c1, Car c2) 
	{
		return c2.getC_name().compareTo(c1.getC_name());
	}
}
