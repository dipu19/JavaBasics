package com.quantum.javabasics;

import java.util.Scanner;

public class UseValueOf {

	public void convert(String string)
	{
		int x=Integer.valueOf(string);
		System.out.println("Integer value of string is "+x);
	}
	public static void main(String[] args)
	{
		System.out.println("Enter the value of string");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		UseValueOf us=new UseValueOf();
		us.convert(s);
	}
}
