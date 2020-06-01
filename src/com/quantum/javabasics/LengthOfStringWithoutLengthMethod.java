package com.quantum.javabasics;

public class LengthOfStringWithoutLengthMethod {

	public static void main(String[] args)
	{
		String s = "Dipu is a good boy";
		
		//without length method calculating length.
		
		char[] charArray = s.toCharArray();
		
		System.out.println("length of string is "+charArray.length);
	}
}
