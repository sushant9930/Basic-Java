package com.hashmap_03;



public class Item {
	
	Integer i_id, price;
	String i_name;
	Supplier s;
	public Integer getI_id() {
		return i_id;
	}
	public void setI_id(Integer i_id) {
		this.i_id = i_id;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getI_name() {
		return i_name;
	}
	public void setI_name(String i_name) {
		this.i_name = i_name;
	}

	
	public String toString() 
	{
		return ("\nItem ID No.: "+getI_id()+"\nItem Name: "+getI_name()+"\nItem Price: "+getPrice());
	}
}
