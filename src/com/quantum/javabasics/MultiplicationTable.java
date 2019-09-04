package com.quantum.javabasics;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args)
	{
	System.out.println("enter a number ");
	Scanner sc=new Scanner(System.in);
	int number=sc.nextInt();
	for(int i=1;i<=10;i++)
	{
	  int c=number*i;	
	   System.out.println(c);
	}
	}
}
