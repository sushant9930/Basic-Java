package com.arraylist_03;

public class Doctor {
	
	int d_id;
	String d_name;
	
	public void setD_id(int d_id) 
	{
		this.d_id=d_id;
	}
	public int getD_id() 
	{
		return d_id;
	}
	
	public void setD_name(String d_name) 
	{
		this.d_name=d_name;
	}
	public String getD_name() 
	{
		return d_name;
	}

	public String toString() 
	{
		return("\nDoctor Id no.: "+getD_id()+"\nDoctor name: "+getD_name());
	}
}
