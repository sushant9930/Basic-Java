package com.arraylist_01;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public class RemoveDays {

	public static void main(String[] args) 
	{
		ArrayList<String> d=new ArrayList<String>();
		
		d.add("Sunday");
		d.add("Monday");
		d.add("Tuesday");
		d.add("Wednesday");
		d.add("Thursday");
		d.add("Friday");
		d.add("Saturday");
		
		
		System.out.println(d.size());
		
		
		for(int i=0; i<d.size(); i++) 
		{
			
			if((int)d.get(i).length()>7) 
			{
				d.remove(i);
				i--;
			}
			
			/*else 
			{
				
				//continue;
			}*/
			
		}
		
		System.out.println(d);
	}

}
