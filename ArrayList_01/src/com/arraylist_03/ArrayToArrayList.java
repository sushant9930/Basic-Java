package com.arraylist_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[] = {10,20,30,40,50,60,70};
		
		//using asList
		List<Integer> a=Arrays.asList(arr);
		System.out.println(a);
		
		List<Integer> a1=new ArrayList<Integer>(Arrays.asList(arr));
		System.out.println(a1);
		
		//
		List<Integer> a2=new ArrayList<Integer>();
		Collections.addAll(a2, arr);
		System.out.println(a2);
		
		//enhance loop
		List<Integer> a3=new ArrayList<Integer>();
		for(Integer i : arr) 
		{
			a3.add(i);
		}
		System.out.println(a3);
	}

}
