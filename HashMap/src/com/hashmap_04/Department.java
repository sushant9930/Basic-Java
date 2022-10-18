package com.hashmap_04;

public class Department {
	
	Integer d_id;
	String d_name, d_city;
	Employee e;
	
	public Employee getE() {
		return e;
	}
	public void setE(Employee e) {
		this.e = e;
	}
	public Integer getD_id() {
		return d_id;
	}
	public void setD_id(Integer d_id) {
		this.d_id = d_id;
	}
	public String getD_name() {
		return d_name;
	}
	public void setD_name(String d_name) {
		this.d_name = d_name;
	}
	public String getD_city() {
		return d_city;
	}
	public void setD_city(String d_city) {
		this.d_city = d_city;
	}
	
	public String toString() 
	{
		return("Department Id no. : "+getD_id()+
			   " Department name : "+getD_name()+
			   " City : "+getD_city()+" Employee Details : "+getE()+"\n");
	}
	

}
