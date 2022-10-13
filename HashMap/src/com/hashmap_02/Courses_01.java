package com.hashmap_02;

public class Courses_01 {
	
	Integer	c_id, c_fees;
	String c_name;
	Studets_01 s;
	
	public Studets_01 getS() {
		return s;
	}
	public void setS(Studets_01 s) {
		this.s = s;
	}
	public Integer getC_id() {
		return c_id;
	}
	public void setC_id(Integer c_id) {
		this.c_id = c_id;
	}
	public Integer getC_fees() {
		return c_fees;
	}
	public void setC_fees(Integer c_fees) {
		this.c_fees = c_fees;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	
	public String toString() 
	{
		return("\nCourse Id No.: "+getC_id()+"\nCourse Name: "+getC_name()+"\nCourse Fees: "+getC_fees()+"\nStudents Details: "+getS());
	}

	
}
