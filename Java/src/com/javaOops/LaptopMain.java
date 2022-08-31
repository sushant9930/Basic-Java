package com.javaOops;

public class LaptopMain {

	public static void main(String[] args) 
	{
		Laptop l=new Laptop();
		l.setUsbPort(5);
		l.setSpeed("Intel Corei5 12th Gen");

		System.out.println("Number of USB ports: "+l.getUsbPort()+"\nProcessor Details: "+l.getSpeed());
	}

}
