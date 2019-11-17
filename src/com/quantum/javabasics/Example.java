package com.quantum.javabasics;


import java.util.*;
public class Example {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n" );
		int n=sc.nextInt();
	long count = 0;
    while (n > 0) {
        if ((n & 1) == 0) {
            count++;
        }
        n >>= 1; // divides by 2
    }long result=2*count;
    System.out.println("Result is "+result);
}
}