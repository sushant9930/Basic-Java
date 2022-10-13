package com.aggregation;

public class Student {
	
	private int id;
	private float per;
	private String name, email;
	
	public void setId(int id) 
	{
		this.id=id;
	}
	public int getId() 
	{
		return id;
	}
	
	public void setEmail(String email) 
	{
		this.email=email;
	}
	public String getEmail() 
	{
		return email;
	}
	
	public void setName(String name) 
	{
		this.name=name;
	}
	public String getName() 
	{
		return name;
	}
	
	public void setPer(float per) 
	{
		this.per=per;
	}
	public float getPer() 
	{
		return per;
	}
	
	
	
	public String toString() 
	{
		return ("\nStudent Id no.: "+getId()+"\nStudent Name: "+getName()+"\nStudent email address: "+getEmail()+"\nStudent Per: "+getPer());
	}
	
	

}
