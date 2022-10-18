package com.hashmap_04;

import java.util.ArrayList;

public class Student {

	Integer s_id;
	String s_name;
	ArrayList<Test> t;
	
	public void setS_id(Integer s_id) 
	{
		this.s_id=s_id;		
	}
	public Integer getS_id() 
	{
		return s_id;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public ArrayList<Test> getT() {
		return t;
	}
	public void setT(ArrayList<Test> t) {
		this.t = t;
	}
	
	public String toString() 
	{
		return("\nStudent Id No. : "+getS_id()+
				" Student Name : "+getS_name()+
				" \nStudent Test Deatils : "+getT());
	}
}
