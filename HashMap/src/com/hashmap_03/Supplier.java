package com.hashmap_03;

public class Supplier {

	Integer s_id;
	String s_name, location;
	Item i;
	
	public Item getI() {
		return i;
	}
	public void setI(Item i) {
		this.i = i;
	}
	public Integer getS_id() {
		return s_id;
	}
	public void setS_id(Integer s_id) {
		this.s_id = s_id;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String toString() 
	{
		return ("\nSupplier ID No.: "+getS_id()+"\nSupplier Name: "+getS_name()+"\nSupplier Location: "+getLocation()+"\nItems: "+getI());
	}

}
