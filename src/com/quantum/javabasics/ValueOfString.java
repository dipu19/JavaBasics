package com.quantum.javabasics;

import java.util.Scanner;

public class ValueOfString {
	
	public void value(String string)
	{
		int x=0;
		for(int i=0;i<string.length();i++)
		{
			int y=string.charAt(i);
			x=x+y;
			
		}System.out.println("value of string is "+x);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.next();
		ValueOfString vs=new ValueOfString();
		vs.value(s);
	}
}
