package com.quantum.javabasics;
import java.util.Scanner;
public class AbsoluteValue {
	public static void main(String[] args )
	{
		System.out.println("Enter the integer");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		System.out.println(Math.abs(number));
	}
}
