package com.hashmap_06;

public class Supplier {

	Integer s_id;
	String s_name;
	Item i;
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
	public Item getI() {
		return i;
	}
	public void setI(Item i) {
		this.i = i;
	}
	
	public String toString() 
	{
		return ("Supplier Id: "+getS_id()+"Supplier Name: "+getS_name()+"Item Details: "+getI());
	}
}
