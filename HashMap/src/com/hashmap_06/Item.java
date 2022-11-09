package com.hashmap_06;

public class Item {

	String i_name;
	Integer price;
	public String getI_name() {
		return i_name;
	}
	public void setI_name(String i_name) {
		this.i_name = i_name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	public String toString() 
	{
		return("Item Name: "+getI_name()+"Price: "+getPrice());
	}
}
