package com.quantum.javabasics;

import java.util.Scanner;

class CustomizedClass extends Exception
{
	CustomizedClass(String s)
	{
		super(s);
	}
}

public class CustomizedExceptionExample  {

	
	public static void main(String[] args) throws CustomizedClass
	{
		System.out.println("Enter the age ");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if(age>60) {
		throw new CustomizedClass("Age crossed");
	}
		else if(age<18)
		{
			throw new CustomizedClass("Below age");
		}
		else
		{
			System.out.println("okay fine");
		}
         
	}
}
