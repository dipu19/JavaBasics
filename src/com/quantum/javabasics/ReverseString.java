package com.quantum.javabasics;

import java.util.Scanner;

//Reverse String
public class ReverseString {
	
	public static void main(String[] args)
	{
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String result="  ";
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
		
	}
}
