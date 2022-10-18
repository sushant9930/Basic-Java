package com.hashmap_04;

public class Employee {

	Integer e_id, e_salary;
	String e_name;
	
	
	public Integer getE_id() {
		return e_id;
	}
	public void setE_id(Integer e_id) {
		this.e_id = e_id;
	}
	public Integer getE_salary() {
		return e_salary;
	}
	public void setE_salary(Integer e_salary) {
		this.e_salary = e_salary;
	}
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	
	
	public String toString() 
	{
		return("Employee Id No.: "+getE_id()+
			   " Employee name : "+getE_name()+
			   " Employee salary : "+getE_salary());
	}
}
