package com.hashmap_05;

public class Show_Room {

	String s_name, s_location;
	Car c;
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public String getS_location() {
		return s_location;
	}
	public void setS_location(String s_location) {
		this.s_location = s_location;
	}
	public Car getC() {
		return c;
	}
	public void setC(Car c) {
		this.c = c;
	}
	
	public String toString() 
	{
		return ("Showroom Name : "+getS_name()+" Showroom Location : "+getS_location()+" Car Details : \n"+getC());
	}
}
