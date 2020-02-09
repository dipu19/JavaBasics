package com.quantum.javabasics;

import java.util.Scanner;

public class ConvertStringToInteger {

	public Integer convert(String input)
	{
		Integer x=Integer.parseInt(input);
		return x;
	}
	public static void main(String[] args)
	{
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		ConvertStringToInteger st=new ConvertStringToInteger();
		System.out.println(st.convert(input));
	}
}
