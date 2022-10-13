package com.hashmap_01;
import java.util.*;
import java.util.Map.Entry;
public class DeleteInput {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		HashMap<Integer, String> hash=new HashMap<>();
		hash.put(1, "Mumbai");
		hash.put(2, "Pune");
		hash.put(3, "Nagpur");
		hash.put(4, "Satara");
		hash.put(5, "Kolhapur");
		hash.put(6, "Sangli");
		hash.put(7, "Solapur");
		hash.put(8, "Thane");
		hash.put(9, "NaviMumbai");
		
		
		
		for(Map.Entry<Integer, String> map : hash.entrySet())
		{
			System.out.println(map.getKey()+" "+map.getValue());
			
		}
		
		System.out.println("Enter which entry  you want to delete: ");
		String s=sc.next();
		//hash.remove(s);
		
	    Iterator<Map.Entry<Integer, String> > 
        itr = hash.entrySet().iterator();
	    while(itr.hasNext()) 
	    {
	    	Map.Entry<Integer, String> entry = itr.next();
	    	if(s.equals(entry.getValue())) 
	    	{
	    		itr.remove();
	    	}
	    }
	    
	    Iterator<Map.Entry<Integer, String>> ss = hash.entrySet().iterator();
	    while(ss.hasNext()) 
	    {
	    	Map.Entry<Integer, String> entry = ss.next();
	    	System.out.println(entry.getKey()+ " "+entry.getValue());
	    	
	    }
	    //System.out.println("\nModified HashMap: "+hash);
		
		
		
	}

}
