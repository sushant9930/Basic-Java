package com.hashmap_01;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class contains {
	
	
	static HashMap<String, Integer> convertArrayListToHashMap(ArrayList<String> arrayList,List<String> al)
	{
		HashMap<String, Integer> hashMap=new HashMap<>();
		Object a[]=al.toArray();
		int count=0;
		for(int i=0; i<a.length; i++) 
		{
			count=1;
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j]) 
				{
					count++;			
					a[j]="";
				}
			}
			if(a[i]!="") 
			{
				for(String str : arrayList) 
				{
					hashMap.put((String) a[i], count);
				}
			}
		}
		return hashMap;
		
		
		
	}

	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("pune");
		al.add("mumbai");
		al.add("pune");
		al.add("mumbai");
		al.add("nashik");
		al.add("pune");
		
	HashMap<String, Integer> map = convertArrayListToHashMap(al,al);
	
	for(Map.Entry<String, Integer> entry: map.entrySet()) 
	{
		System.out.println(entry.getKey()+" "+entry.getValue());
	}
		
	
		
	}

}
