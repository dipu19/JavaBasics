package com.quantum.javabasics;
import java.util.*;
public class StrangeCounter {
	public static void main(String[] args)
	{
		System.out.println("Enter the value of t");
		Scanner sc=new Scanner(System.in);
		long n1=sc.nextLong();
		long n=2;
		
        while (3 * (n - 1) < n1) n = 2 * n;
        System.out.println((3 * (n - 1) - n1 + 1));
				
	}
}
