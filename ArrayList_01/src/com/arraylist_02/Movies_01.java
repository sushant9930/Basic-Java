package com.arraylist_02;

public class Movies_01 implements Comparable<Movies_01> 
{

	
		Integer m_id, m_bcollection;
		String m_name;
		Float m_rating;
		public Movies_01(Integer m_id, Integer m_bcollection, String m_name, Float m_rating) 
		{
			//super();
			this.m_id = m_id;
			this.m_bcollection = m_bcollection;
			this.m_name = m_name;
			this.m_rating = m_rating;
		}
		
		//@Override
		//public int compareTo(Movies_01 o) {
		//}
		
		public String toString() {
			return "\nMovies Id no: " + m_id + "\nMovies Box Office Collection: " + m_bcollection + 
					"\nMovie name: " + m_name + "\nMovie rating: "+ m_rating ;
		}
	

		@Override
		public int compareTo(Movies_01 o) 
		{
			return o.m_name.compareTo("RRR");
		}
			
}