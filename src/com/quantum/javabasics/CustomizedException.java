package com.quantum.javabasics;

import java.util.Scanner;

//customized exception.
class TooYoung extends Exception
{
	 TooYoung(String s)
	{
		super(s);
	}
}
class TooOld extends Exception
{
	 TooOld(String s)
	{
		super(s);
	}
}
public class CustomizedException {
	public static void main (String[] args) throws TooOld, TooYoung
	{
		System.out.println("Enter the age ");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if(age>60)
		{
			throw new TooOld("please your age is too young");
		}
		if(age<18)
		{
			throw new TooYoung("please your age is too old");
		}
		else 
		{
			System.out.println("Yes you are perfect for marry");
		}
	}
}
