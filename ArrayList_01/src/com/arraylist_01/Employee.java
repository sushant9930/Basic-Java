package com.arraylist_01;

public class Employee implements Comparable<Employee>
{
	
	Integer id, salary;
	private String name;

	public void setId(int id) 
	{
		this.id=id;
	}
	public int getId() 
	{
		return id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//@Override
	public String toString() 
	{
		return("\nEmployee Id no.: "+getId()+"\nEmployee name: "+getName()+"\nEmployee salary: "+getSalary());
	}
	@Override
	public int compareTo(Employee e) 
	{
		if(this.salary>e.salary) 
		{
			return 1;
		}
		else if(this.salary < e.salary) 
		{
			return -1;
		}
		else {
			//if(e.salary.equals(e.salary)) 
			
				return this.name.compareTo(e.name);
			
		}
		
		
		
		//return this.salary.compareTo(e.salary);
			}
	
	
}
