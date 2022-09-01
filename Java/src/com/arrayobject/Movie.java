package com.arrayobject;

public class Movie 
{
	int mid;
	String mname,director,releaseyear;
	long boxcollection;
	
	Movie(int mid,String mname ,String director,long boxcollection, String releaseyear )
	{
		this.mid=mid;
		this.mname=mname;
		this.director=director;
		this.boxcollection=boxcollection;
		this.releaseyear=releaseyear;
		
	}
	
//	public String toString() 
//	{
//		return("\nMovie Id no.: "+mid+
//			   "\nMovie name: "+mname+
//			   "\nMovie Producer name: "+producer+
//			   "\nBoxOffice Collection: "+boxcollection+
//			   "\nMovie Release Year: "+releaseyear);
//	}
}
