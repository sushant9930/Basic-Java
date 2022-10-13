package com.aggregation;

public class Person {
	
	private int id, age;
	private long contact;
	private String name;
	Address a;
	
	public void setId(int id) 
	{
		this.id=id;
	}
	public int getId() 
	{
		return id;
	}
	
	public void setContact(long contact) 
	{
		this.contact=contact;
	}
	public long getContact() 
	{
		return contact;
	}
	
	public void setAge(int age) 
	{
		this.age=age;
	}
	public int getAge() 
	{
		return age;
	}
	
	public void setName(String name) 
	{
		this.name=name;
	}
	public String getName() 
	{
		return name;
	}
	
	public void setA(Address a) 
	{
		this.a=a;
	}
	public Address getA() 
	{
		return a;
	}
	
	public String toString() 
	{
		return("Person Name: "+getName()+"\nPerson age: "+getAge()+"\nPerson Id no.: "+getId()+"\nPerson Contact details: "+getContact()+"\nPerson Address: "+getA()+"\n");
	}
}
