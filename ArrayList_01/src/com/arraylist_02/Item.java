package com.arraylist_02;

import java.util.Comparator;

public class Item {
	int item_id;
	String item_name;
	Integer price;
	public Item(int item_id, String item_name, int price) {
		super();
		this.item_id = item_id;
		this.item_name = item_name;
		this.price = price;
	}
	@Override
	public String toString() {
		return item_id + " " + item_name + " " + price ;
	}
	
	

}