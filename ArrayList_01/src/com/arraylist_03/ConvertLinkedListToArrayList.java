package com.arraylist_03;
import java.util.*;
public class ConvertLinkedListToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> l=new LinkedList<Integer>();
		l.add(10);
		l.add(20);
		l.add(50);
		l.add(60);
		l.add(30);
		l.add(40);
		
		System.out.println("LinkedList Printing: "+l);
		
		System.out.println("-------------------------");
		ArrayList<Integer> al=new ArrayList<Integer>(l);
		
		System.out.println("ArrayList Printing: "+al);

	}

}
