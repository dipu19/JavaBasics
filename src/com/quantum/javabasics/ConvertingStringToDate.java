package com.quantum.javabasics;

import java.time.LocalDate;

public class ConvertingStringToDate {

	public static void main(String[] arga)
	{
		String armisticeDate = "2004-04-20";
		 
		LocalDate aLD = LocalDate.parse(armisticeDate);
		System.out.println("Date: " + aLD);
	}
}
