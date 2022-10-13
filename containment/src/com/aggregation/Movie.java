package com.aggregation;

public class Movie {

	
		private int mid,year;
		private long collection;
		private String mname;
		
		public void setYear(int year) 
		{
			this.year=year;
		}
		public int getYear() 
		{
			return year;
		}
		
		public void setCollection(long collection) 
		{
			this.collection=collection;
		}
		public long getCollection() 
		{
			return collection;
		}
		
		public void setMname(String mname) 
		{
			this.mname=mname;
		}
		public String getMname() 
		{
			return mname;
		}
		public void setMid(int mid) 
		{
			this.mid=mid;
		}
		public int getMid() 
		{
			return mid;
		}

		public String toString() 
		{
			return("\nMovie Id No.: "+getMid()+"\nMovie name: "+getMname()+"\nBoxOffice collection: "+getCollection()+"\nRelease year: "+getYear()+"\n");
		}
	

}
