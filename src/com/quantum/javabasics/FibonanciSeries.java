package com.quantum.javabasics;

import java.util.Scanner;

public class FibonanciSeries {
	public static void main(String[] args)
	{
		System.out.println("Enter number");
		Scanner number=new Scanner(System.in);
		int n=number.nextInt();
		int total=1;
		int n1=0;
		int fibonanci=0;
		System.out.print(0);
		System.out.print(","+1);
		while(total<n)
		{
		fibonanci=n1+total;
		n1=total;
		total=fibonanci;
		System.out.print(","+total);
		}
	}

}
