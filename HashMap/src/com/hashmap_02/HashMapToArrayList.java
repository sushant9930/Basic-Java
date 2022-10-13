package com.hashmap_02;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.*;
import java.util.*;
public class HashMapToArrayList {

	public static void main(String[] args) 
	{
		HashMap<Integer, String> it=new HashMap<>();
		it.put(1, "Sushant");
		it.put(2, "Nilesh");
		it.put(3, "Sachin");
		it.put(4, "Samir");
		it.put(5, "Rahul");
		it.put(6, "Pratik");
		it.put(7, "Faraq");
		
		///convert hashmap to arraylist of key using keyset()
		Set<Integer> map=it.keySet();
		ArrayList<Integer> al=new ArrayList<>(map);
		System.out.println(al);
		
		///Convert hashmap to arralist of KEy using keySet()		
		Collection<String> map_01 = it.values();
		ArrayList<String> in_01=new ArrayList<String>(map_01);
		System.out.println(in_01);
		
		//
		Set<Map.Entry<Integer,String>> entrySet = it.entrySet();
		ArrayList<Entry<Integer, String>> list=
				new ArrayList<Entry<Integer, String>>(entrySet);
		System.out.println(list);

		
		///
		
		ArrayList<Integer> listOfKeys 
        = it.keySet().stream().collect( 
            Collectors.toCollection(ArrayList::new));
		
		ArrayList<String> listOfValue = it.values().stream().collect(
				Collectors.toCollection(ArrayList::new));
		
		System.out.println(listOfKeys);
		System.out.println(listOfValue);
	}

}
