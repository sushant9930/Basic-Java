package com.hashmap_05;
import java.util.*;
public class Car 
{

	Integer c_id, c_price;
	Float c_rating;
	String c_name;
	
	public void setC_id(Integer c_id) 
	{
		this.c_id=c_id;
	}
	public Integer getC_id() 
	{
		return c_id;
	}
	public Integer getC_price() {
		return c_price;
	}
	public void setC_price(Integer c_price) {
		this.c_price = c_price;
	}
	public Float getC_rating() {
		return c_rating;
	}
	public void setC_rating(Float c_rating) {
		this.c_rating = c_rating;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	
	public String toString() 
	{
		return("Car id no : "+getC_id()+" Car Name : "+getC_name()
				+" Car Price : "+getC_price()+" Car Rating : "+getC_rating()+"\n");
	}
	
	
}
