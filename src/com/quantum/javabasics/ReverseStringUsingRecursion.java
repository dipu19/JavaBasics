package com.quantum.javabasics;

import java.util.Scanner;

public class ReverseStringUsingRecursion {

	public void reverse(String str)
	{
		String x="";
		int i=str.length();
		while(i!=0)
		{
			x=x+str.charAt(i-1);
			i--;
		}
		System.out.println("Reverse string is "+x);
	}
	public static void main(String[] args)
	{
		ReverseStringUsingRecursion obj=new ReverseStringUsingRecursion();
		System.out.println("Enter a string ");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		obj.reverse(str);
		
		
	}
}
