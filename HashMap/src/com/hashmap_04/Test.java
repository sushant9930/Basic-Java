package com.hashmap_04;

public class Test {

	String t_name;
	String test_given_date;
	public String getT_name() {
		return t_name;
	}
	public void setT_name(String t_name) {
		this.t_name = t_name;
	}
	public String getTest_given_date() {
		return test_given_date;
	}
	public void setTest_given_date(String test_given_date) {
		this.test_given_date = test_given_date;
	}
	
	public String toString() 
	{
		return("\nTest Name : "+getT_name()+
				" Test date : "+getTest_given_date());
	}
}
