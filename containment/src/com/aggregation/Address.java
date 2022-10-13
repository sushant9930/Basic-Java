package com.aggregation;

public class Address {
	
	private String street, city,state, country ;
	
	public void setStreet(String street) 
	{
		this.street=street;		
	}
	public String getStreet() 
	{
		return street;
	}
	
	public void setCity(String city) 
	{
		this.city=city;		
	}
	public String getCity() 
	{
		return city;
	}
	
	public void setState(String state) 
	{
		this.state=state;		
	}
	public String getState() 
	{
		return state;
	}
	
	public void setCountry(String country) 
	{
		this.country=country;		
	}
	public String getCountry() 
	{
		return country;
	}
	
	public String toString()
	{
		return("\nStreet: "+getStreet()+"\nCity: "+getCity()+"\nState: "+getState()+"\nCountry: "+getCountry());
	}
}
