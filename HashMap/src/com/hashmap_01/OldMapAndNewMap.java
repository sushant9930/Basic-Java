package com.hashmap_01;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class OldMapAndNewMap {
	
	//private static Object Character;

	static HashMap<Character, Integer> counting(ArrayList<Character> al)
	{
		HashMap<Character, Integer> hs=new HashMap<>();
		Object[] a=al.toArray();
		int count=0;
		for(int i=0; i<a.length; i++) 
		{
			count=1;
			for(int j=i+1; j<a.length; j++) 
			{
				if(a[i]==a[j]) 
				{
					count++;
					a[j]='0';
				}
			}
			if(a[i]!=(Character)'0') 
			{
				for(Character c : al) 
				{
					hs.put((Character)a[i], count);
				}
			}
		}
		return hs;
	}

	public static void main(String[] args) {
		
		HashMap<Integer, Character> oldmap=new HashMap<Integer,Character >();
		oldmap.put(1, 'a');
		oldmap.put(2, 'b');
		oldmap.put(3, 'c');
		oldmap.put(4, 'b');
		oldmap.put(5, 'a');
		oldmap.put(6, 'a');
		
		//use to covert hashmap to ArrayList
		Collection<Character> value= oldmap.values();
		
		ArrayList<Character> c=new ArrayList<Character>(value);
		
		
		HashMap<Character, Integer> newmap=counting(c);
		
		for(Map.Entry<Character, Integer> e : newmap.entrySet()) 
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
		
		
		
	}

}
