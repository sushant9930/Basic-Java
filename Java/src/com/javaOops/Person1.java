package com.javaOops;

public class Person1 
{
	private long id;
	private String name, contact,add;
	IdProof i;
	public void setId(long  id) 
	{
		this.id=id;
	}
	public long getId() 
	{
		return id;
	}
	
	public void setName(String name) 
	{
		this.name=name;
	}
	public String getName() 
	{
		return name;
	}
	
	public void setContact(String contact) 
	{
		this.contact=contact;
	}
	public String getContact() 
	{
		return contact;
	}
	
	public void setAdd(String add) 
	{
		this.add=add;
	}
	public String getAdd() 
	{
		return add;
	}
	
	public void setI( IdProof i) 
	{
		this.i=i;
	}
	public IdProof getI() 
	{
		return i;
	}
	
//	Person1(long id, String name, String add, String contact, IdProof i)
//	{
//		this.id=id;
//		this.name=name;
//		this.add=add;
//		this.contact=contact;
//		this.i=i;
//		
//	}
	
	/*
	 * public String toString() { return( "Company Id Number: "+id+
	 * "\nPerson Name: "+name+ "\nContact details: "+contact+
	 * "\nAddress: "+add+"\n"+i); }
	 */

}
