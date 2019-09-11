package com.quantum.javabasics;

import java.math.BigInteger;
import java.util.Scanner;
public class ExtraLongFactor {
	public static void main(String[] args)
	{
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		BigInteger factorial=BigInteger.ONE;;
		while(number>0)
		{
		factorial= factorial.multiply(BigInteger.valueOf(number));
		--number;
		}System.out.println(factorial);
	}

}
