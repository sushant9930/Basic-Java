package com.javaconstructor;

import java.util.*;

public class BikeDetails {
	
	public int engine,installment,engine1,engine2;                                            //id,name,colour,price,finalprice,
	public String name,colour,pay,name1,colour1,pay1,name2,colour2,pay2;
	public float price,finalprice,price1,finalprice1,price2,finalprice2;
	public long id,id1,id2;
	public static String bikeBrand;
	
	static 
	{
		bikeBrand="----HERO MOTORS----";
	}	
	BikeDetails(long a, String b,int e, String c, float d,long a1, String b1,int e1, String c1, float d1,long a2, String b2,int e2, String c2, float d2)
	{
		id=a;
		name=b;
		engine=e;
		colour=c;
		price=d;
		id1=a1;
		name1=b1;
		engine1=e1;
		colour1=c1;
		price1=d1;
		id2=a2;
		name2=b2;
		engine2=e2;
		colour2=c2;
		price2=d2;
	}
	
	
	BikeDetails()
	{
		id=121;
		name="Splender";
		engine=99;
		colour="Black";
		price=90000f;
		id1=122;
		name1="Hero Delux";
		engine1=90;
		colour1="Black with red";
		price1=85000f;
		id2=123;
		name2="Xtreme 200S";
		engine2=200;
		colour2="White";
		price2=135000f;
		
	}
	/*void delux() 
	{
		id=0122;
		name="Hero Delux";
		colour="Black";
		price=85000f;
	}
	void xtreme() 
	{
		id=0123;
		name="Hero Delux";
		colour="Black";
		price=85000f;
	}*/

	void bike(int b) 
	{
		switch(b) 
		{
		case 1:
			
			System.out.println("You selected  HERO SPLENDER.....");
			break;
		case 2:
			
			System.out.println("You selected  HERO DELUX.....");
			break;
		case 3:
			
			System.out.println("You selected  HERO XTREME 200S.....");
			break;
		}
	}
	void payment(int chh) 
	{
		//System.out.println("Choose payment mode");
		//System.out.println("1: One time payment ");
		//System.out.println("2: Installment ");
		//System.out.println("Choose from above....");
		switch(chh) 
		{
		case 1:
			
			System.out.println("You choose one time payment....");
			break;
		case 2:
			System.out.println("You choose installment option...");
			break;
		}		
	}
	void cash() 
	{
		installment=0;
	}	
	void installment1(int op) 
	{
		//System.out.println("You selected installment option...");
		//System.out.println("Now choose installmen option as follow:");
		//System.out.println("1: 1 month");
		//System.out.println("2: 2 month");
		//System.out.println("3: 3 month");
		switch(op) 
		{
		case 1:
			installment=1;
			break;
		case 2:
			installment=2;
			break;
		case 3:
			installment=3;
			break;
		case 4:
			installment=4;
			break;
		default:
			installment=4;
			System.out.println("Sorry your not eligible for offer...");
		}		
	}
	void choice(int ch) 
	{
	  switch(ch) 
	  {
	  case 1:
		  System.out.println("Id No.: "+id);
		  System.out.println("Model name : "+name);
		  System.out.println("Engine capacity: "+engine+" CC");
		  System.out.println("Bike colour: "+colour);
		  System.out.println("Original price : "+price);
		  if(installment<=0 ) 
			{  
			  finalprice=price-(price*0.2f);
			    System.out.println("Congratulation you got 20% discount on original price");
				System.out.println("Now your final price is...."+finalprice);
			}
			else if(installment==1 ) {
				finalprice=price-(price*0.15f);
				System.out.println("Congratulation you got 15% discount on original price");
			    System.out.println("Now your final price is...."+finalprice);
		       }
			else if(installment==2) {
				finalprice=price-(price*0.10f);
				System.out.println("Congratulation you got 10% discount on original price");
			    System.out.println("Now your final price is...."+finalprice);
		       }
			else if(installment==3) {
				finalprice=price-(price*0.05f);
				System.out.println("Congratulation you got 5 % discount on original price");
			    System.out.println("Now your final price is...."+finalprice);
		       }	
			else if(installment>3)
			{
				finalprice=price;
				System.out.println("Your not eligible for offer.....");
			}
		  break;
		  
	  case 2:
		  System.out.println("Id No.: "+id1);
		  System.out.println("Model name : "+name1);
		  System.out.println("Engine capacity: "+engine1+" CC");
		  System.out.println("Bike colour: "+colour1);
		  System.out.println("Original price : "+price1);
		  if(installment<=0) 
			{
				finalprice1=price1-(price1*0.2f);
			    System.out.println("Congratulation you got 20% discount on original price");
				System.out.println("Now your final price is...."+finalprice1);
			}
			else if(installment==1) {
				finalprice1=price1-(price1*0.15f);
				System.out.println("Congratulation you got 15% discount on original price");
			    System.out.println("Now your final price is...."+finalprice1);
		       }
			else if(installment==2) {
				finalprice1=price1-(price1*0.10f);
				System.out.println("Congratulation you got 10% discount on original price");
			    System.out.println("Now your final price is...."+finalprice1);
		       }
			else if(installment==3) {
				finalprice1=price1-(price1*0.05f);
				System.out.println("Congratulation you got 5 % discount on original price");
			    System.out.println("Now your final price is...."+finalprice1);
		       }	
			else if(installment>3)
			{
				finalprice1=price1;
				System.out.println("Your not eligible for offer.....");
			}
		  break;
		  
	  case 3:
		  System.out.println("Id No.: "+id2);
		  System.out.println("Model name : "+name2);
		  System.out.println("Engine capacity: "+engine2+" CC");
		  System.out.println("Bike colour: "+colour2);
		  System.out.println("Original price : "+price2);
		  if(installment<=0) 
			{
				finalprice2=price2-(price2*0.2f);
			    System.out.println("Congratulation you got 20% discount on original price");
				System.out.println("Now your final price is...."+finalprice2);
			}
			else if(installment==1) {
				finalprice2=price2-(price2*0.15f);
				System.out.println("Congratulation you got 15% discount on original price");
			    System.out.println("Now your final price is...."+finalprice2);
		       }
			else if(installment==2) {
				finalprice2=price2-(price2*0.10f);
				System.out.println("Congratulation you got 10% discount on original price");
			    System.out.println("Now your final price is...."+finalprice2);
		       }
			else if(installment==3) {
				finalprice2=price2-(price2*0.05f);
				System.out.println("Congratulation you got 5 % discount on original price");
			    System.out.println("Now your final price is...."+finalprice2);
		       }	
			else if(installment>3)
			{
				finalprice2=price2;
				System.out.println("Your not eligible for offer.....");
			}
		  break;  
	  }	  
	}
}










