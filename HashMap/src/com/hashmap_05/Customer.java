package com.hashmap_05;

public class Customer {

	Integer c_id;
	String c_name, d_of_account;
	public Integer getC_id() {
		return c_id;
	}
	public void setC_id(Integer c_id) {
		this.c_id = c_id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public String getD_of_account() {
		return d_of_account;
	}
	public void setD_of_account(String d_of_account) {
		this.d_of_account = d_of_account;
	}
	
	public String toString() 
	{
		return("Customer Id no : "+getC_id()+" :: "+" Customer Name : "
				+getC_name()+" :: "+" Date of account : "+getD_of_account());
	}
}
