package com.quantum.javabasics;

public class DifferentWaysOfStringConcatenation {

	public void firstWayOfConcatenation(String firstString,String secondString)
	{
		String firstResult = firstString + secondString;
		
		String secondResult=firstString.concat(secondString);
		
		System.out.println("first result "+firstResult);
		
		System.out.println("second result "+secondResult);
	}
	
	public static void main(String[] args)
	{
		String firstString = "abc";
		
		String secondString = "DEF";
		
		DifferentWaysOfStringConcatenation object = new DifferentWaysOfStringConcatenation();
		
		object.firstWayOfConcatenation(firstString, secondString);
	}
}
