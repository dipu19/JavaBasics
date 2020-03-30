package com.quantum.javabasics;

import java.util.Scanner;

public class ConversionOfDecimalToBinary {

	public static void main(String[] args)
	{
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		String string = " ";
		while(number>0)
		{
			int a =number%2;
			string = a+""+string;
			number  = number/2;
		}
		System.out.println(string);
	}
}
