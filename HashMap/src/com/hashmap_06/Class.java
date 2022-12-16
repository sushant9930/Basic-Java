package com.hashmap_06;

import java.util.Objects;

public class Class 
{
	int cid;
	String classname;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public Class(int cid, String classname) {
		super();
		this.cid = cid;
		this.classname = classname;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cid, classname);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Class other = (Class) obj;
		return cid == other.cid && Objects.equals(classname, other.classname);
	}
	@Override
	public String toString() {
		return "Class [cid=" + cid + ", classname=" + classname + "]";
	}
	
	

}
