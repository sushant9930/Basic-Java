package com.basicjava;

import java.util.Scanner;

public class Marksheet {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Please enter Maths marks : ");
		float mathematics= sc.nextInt();	
		System.out.println("Please enter Physics marks :");
		float physics= sc.nextInt();
		System.out.println("Please enter Chemistry marks :");
		float chemistry = sc.nextInt();
		System.out.println("Please enter Zoology marks : ");
		float zoology = sc.nextInt();
		System.out.println("Please enter Biology marks : ");
		float biology = sc.nextInt();
		
		//require marks in each subject
		float maths=100;
		float phy=100;
		float chem=100;
		float zoo=100;
		float bio=100;
		float total= maths+phy+chem+zoo+bio;
				
		System.out.println("Marks of student");
		System.out.println("Marks of Mathematics :" +mathematics +" "+ "out of" + maths);
		System.out.println("Marks of Physics :" +physics +" "+ "out of" + phy);
		System.out.println("Marks of Chemistry :" +chemistry +" "+ "out of" + chem);
		System.out.println("Marks of Zoology :" +zoology +" "+ "out of" + zoo);
		System.out.println("Marks of Biology :" +biology +" "+ "out of" + bio);	
		
		float totalmarks = mathematics + physics + chemistry + zoology + biology;
		
		System.out.println("Total marks of all subject :"+totalmarks+" "+"out of"+" "+total);
		
		float average =totalmarks/5;
		System.out.println("Average :" + average);
		
        float percentage = (totalmarks / total) * 100;
	    System.out.println("Percentage :" +percentage+"%");


		if(percentage >= 85) 
		{
			System.out.println("A+ Grade");
		}
		else if (percentage >=75 && percentage < 85)
		{ 
			System.out.println("A Grade");
		}
		else if (percentage >=65 && percentage < 75)
		{ 
			System.out.println("B Grade");
		}
		else if (percentage >=55 && percentage < 65)
		{ 
			System.out.println(" C Grade");
		}
		else if (percentage >=45 && percentage < 55)
		{ 
			System.out.println("D Grade");
		}
		else if (percentage >=35 && percentage < 45)
		{ 
			System.out.println("Pass");
		}
		
		else 
		{
			System.out.println("Fail");
		}	
		}		
	}


