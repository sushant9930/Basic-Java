package com.aggregation;

import java.util.Arrays;

public class Theater 
{
	private int tid;	
	private String tname;
	Movie m[];
	
	public void setTid(int tid) 
	{
		this.tid=tid;
	}
	public int getTid() 
	{
		return tid;
	}
	public void setTname(String tname) 
	{
		this.tname=tname;
	}
	public String getTname() 
	{
		return tname;
	}
	
	public void setM(Movie [] m) 
	{
		this.m=m;
	}
	public Movie[] getM() 
	{
		return m;
	}
	

	
	public String toString() 
	{
		return("Theater Id No.: "+getTid()+"\nTheater Name: "+getTname()+"\nMovies details: "+(Arrays.toString(m)));
	}
}
