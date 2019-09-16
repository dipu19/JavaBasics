package com.quantum.javabasics;

public class Multiplication {
	public static void main(String[] args)
	{
		int firstNo = 100;
		int secondNo = 20;
		int finalNo = firstNo*secondNo;  
		int count = 0;
		while (finalNo > 1000) 
		{    finalNo = firstNo*secondNo;
			System.out.println("Good job " + (count+1));
			firstNo = firstNo-5 ;
			count++;
		}
		System.out.println("So sad");
		
	}
}
