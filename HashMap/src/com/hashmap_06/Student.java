package com.hashmap_06;

import java.util.Arrays;
import java.util.Objects;

public class Student
{
	Integer sid;
	String sname;
	
	
	

	
	public Integer getSid() {
		return sid;
	}




	public void setSid(Integer sid) {
		this.sid = sid;
	}




	public String getSname() {
		return sname;
	}




	public void setSname(String sname) {
		this.sname = sname;
	}

	public Student(Integer sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
		
	}




	@Override
	public int hashCode() {
		return Objects.hash(sid, sname);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return sid == other.sid && Objects.equals(sname, other.sname);
	}


	


	public String toString() {
		return "\nStudent sid : " + sid +
			   "   Student name : " + sname +
			   
			   "\n";
	}




	


}
