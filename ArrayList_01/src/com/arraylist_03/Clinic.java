package com.arraylist_03;

public class Clinic 
{
	Integer c_id, rating;
	String c_name, location;
	Doctor d;
	
	public void setC_id(Integer c_id) 
	{
		this.c_id=c_id;
	}
	public Integer getC_id() 
	{
		return c_id;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Doctor getD() {
		return d;
	}
	public void setD(Doctor d) {
		this.d = d;
	}
	
	public String toString() 
	{
		return("\nClinic Id No.: "+getC_id()+"\nClinic name: "+getC_name()+
				"\nClinic location: "+getLocation()+"\nClinic Rating: "+getRating()+"\nDoctor Details: "+getD());
	}
	
	

}
