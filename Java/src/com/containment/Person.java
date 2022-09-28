package com.containment;

import java.util.Arrays;

public class Person 
{	
	private int pid;
	private String firstname, lastname, contact;
	IdProof i[];
	
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	public void setPid(int pid) 
	{
		this.pid=pid;
	}
	public int getPid() 
	{
		return pid;
	}
	
	public void setFirstname(String firstname) 
	{
		this.firstname=firstname;
	}
	public String getFirstname() 
	{
		return firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public void setI(IdProof [] i) 
	{
		this.i=i;
	}
	public IdProof[] getI() 
	{
		return i;
	}

	public String toString() 
	{
		return("Person employee Id No.: "+getPid()+"\nPerson Name: "+getFirstname()+" "+getLastname()+"\nPerson contact details: "+getContact()+"\nId Proof Details: "+(Arrays.toString(i)));
	}
}
