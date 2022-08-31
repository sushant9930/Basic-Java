/*Rohan wants a magic board, which displays a character for a corresponding number for his science exhibition. Help him to develop such application. 

For example when the digits 65,66,67,68 are entered, the alphabet ABCD are to be displayed.

[Assume the number of inputs should be always 4 ]
Sample Input 1:
Enter the digits:
65
66
67
68
Sample Output 1:
65-A
66-B
67-C
68-D
  */
package com.basicjava;

import java.util.Scanner;

public class Uppercase {

	public static void main(String[] args) 
	{
		System.out.println("Enter number....");
		Scanner sc=new Scanner (System.in);
		
		int num=sc.nextInt();
		char ch=(char)num;
		// ab = ch=num;
		
System.out.println("your alphabet is...."+ch);
System.out.println("your number....."+num);
	}

}
