package com.containment;

public class IdProof 
{
	private long id;
	private String pfirstname, plastname;
	
	public String getPlastname() {
		return plastname;
	}
	public void setPlastname(String plastname) {
		this.plastname = plastname;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPfirstname() {
		return pfirstname;
	}
	public void setPfirstname(String pfirstname) {
		this.pfirstname = pfirstname;
	}
	
	public String toString() 
	{
		return("\nId Name: "+getId()+"\nId no.: "+getPfirstname()+" "+getPlastname());
	}

}
