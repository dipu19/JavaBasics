package com.quantum.javabasics;
import java.util.*;
public class RoundOfInteger {
	public static void main(String[] args)
	{
		System.out.println("Enter the 1st number");
		Scanner sc=new Scanner(System.in);
		double num1=sc.nextDouble();
		System.out.println("Enter the 2nd number");
		double num2=sc.nextDouble();
		double d=num1/num2;
		
		System.out.println(Math.round(d));
	}
}
