package com.Arrays;

import java.util.Scanner;

public class PrimeNumberArray {

	
	
		public static void main(String[] args)
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the size of the array :");
			int size = scanner.nextInt();

			int[] values = new int[size];

			System.out.println("Enter the elements of the array : ");
			for (int i = 0; i < size; i++)
			{
				values[i] = scanner.nextInt();
			}

			System.out.println("*** Printing the Prime Numbers ***");
			for (int i = 0; i < size; i++)
			{
				if (checkPrime(values[i]))
				{
					System.out.print(values[i]+" ");
				}
			}

		}

		public static boolean checkPrime(int n)
		{
			if (n <= 1)
				return false;

			int i = 2;
			while (i <= n / 2)
			{
				if ((n % i) == 0)
					return false;
				i++;
			}

			return true;
		}
}
