package com.arraylist_02;

public class Movies implements Comparable<Movies> 
{

	
		Integer m_id, m_bcollection;
		String m_name;
		Float m_rating;
		public Movies(Integer m_id, Integer m_bcollection, String m_name, Float m_rating) 
		{
			//super();
			this.m_id = m_id;
			this.m_bcollection = m_bcollection;
			this.m_name = m_name;
			this.m_rating = m_rating;
		}
		@Override
		public String toString() {
			return "\nMovies Id no: " + m_id + "\nMovies Box Office Collection: " + m_bcollection + 
					"\nMovie name: " + m_name + "\nMovie rating: "+ m_rating ;
		}
		@Override
		public int compareTo(Movies o) {
			return this.m_name.compareTo(o.m_name);
		}
		
		
	

	

}
