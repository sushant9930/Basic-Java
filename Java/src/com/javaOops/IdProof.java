package com.javaOops;

public class IdProof
{
	private String nam, valid;
	private long num;
	
	public void setNam(String nam) 
	{
		this.nam=nam;
	}
	public String getNam() 
	{
		return nam;
	}
	
	public void setValid(String valid) 
	{
		this.valid=valid;
	}
	public String getValid() 
	{
		return valid;
	}
	
	public void setNum(long num) 
	{
		this.num=num;
	}
	public long getNum() 
	{
		return num;
	}

		
	/*
	 * IdProof(long num, String nam, String valid) { this.num=num; this.valid=valid;
	 * this.nam=nam;
	 * 
	 * 
	 * }
	 */

//	public String toString() 
//	{
//		return ("\n\nId Proof Details: "+
//				"\nID Proof: "+nam+
//				"\nId Number: "+num+
//				"\nValid Upto: "+valid);
//	}
}
