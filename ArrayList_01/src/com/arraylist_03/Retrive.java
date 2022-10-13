package com.arraylist_03;
import java.util.*;
public class Retrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> l=new LinkedList<Integer>();
		l.add(10);
		l.add(20);
		l.add(50);
		l.add(60);
		l.add(30);
		l.add(40);
		
		System.out.println("Original LinkedList: "+l);
		
		
		System.out.println("First element in list: "+l.peekFirst());
		
		
		System.out.println("Original LinkedList:  "+l);

	}

}
