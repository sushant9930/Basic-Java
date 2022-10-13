package com.hashmap_02;

public class Studets_01 {

	Integer roll;
	String s_name;
	
	public void setRoll(int roll) 
	{
		this.roll=roll;
	}
	public int getRoll() 
	{
		return roll;
	}
	
	public void setS_name(String s_name) 
	{
		this.s_name=s_name;
	}
	public String getS_name() 
	{
		return s_name;
	}
	
	public String toString () 
	{
		return ("\nStudent Roll No: "+getRoll()+"\nStudent Name: "+getS_name());
				
	}
}
