package com.aggregation;

import java.util.Arrays;

public class Department {
	
	private int id;
	private String deptname;
	Student ss[];
	
	public void setId(int id)	
	{
		this.id=id;
	}
	public int getId() 
	{
		return id;		
	}
	
	public void setDeptname(String deptname)	
	{
		this.deptname=deptname;
	}
	public String getDeptname() 
	{
		return deptname;		
	}
	
	public void setSs(Student[] ss)	
	{
		this.ss=ss;
	}
	public Student[] getSs() 
	{
		return ss;		
	}
	
	public String toString() 
	{
		return("Department Id no.: "+getId()+"\nDepartment Name: "+getDeptname()+"\nStudents Details: "+(Arrays.toString(ss)));
	}

}
