package com.hashmap_06;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
public class ClassStudentMain {

	public static void main(String[] args) 
	{
		HashMap<Student, Class> hm=new HashMap<Student, Class>();
		
		Class c1=new Class(1,"FirstClass");
		Class c2=new Class(2,"SecondClass");
		Class c3=new Class(3,"ThirdClass");
		Class c4=new Class(4,"FourClass");
		Class c5=new Class(5,"FiveClass");
		Class c6=new Class(6,"SixClass");
		Class c7=new Class(7,"SevenClass");
		
		Student s1=new  Student(101,"Student");
		Student s2=new  Student(102,"Sunil");
		Student s3=new  Student(103,"Ajay");
		Student s4=new  Student(104,"Pratik");
		Student s5=new  Student(105,"Isha");
		Student s6=new  Student(106,"Mahesh");
		Student s7=new  Student(107,"Rahul");
		
		hm.put(s1, c1);
		hm.put(s2, c2);
		hm.put(s3, c3);
		hm.put(s4, c4);
		hm.put(s5, c5);
		hm.put(s6, c6);
		hm.put(s7, c7);
		
		Set<Student> s=hm.keySet();
		ArrayList<Student> ss1=new ArrayList<Student>();
		ss1.addAll(s);
		Collections.sort(ss1,new SortSName());
		
		
		
		Collection<Class> col=hm.values();
		
		SortedSet<Class> ss=new TreeSet<Class>(new NameSortClass());
		ss.addAll(col);
	
		
		
		
		HashMap<ArrayList<Student> , SortedSet<Class>> hm1=new HashMap<ArrayList<Student> , SortedSet<Class>>();
		hm1.put(ss1, ss);
		
		System.out.println(hm1);
	}

}
