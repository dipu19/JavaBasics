package com.quantum.javabasics;

import java.util.Scanner;

public class ManasAndStones {

	public  void calculateStones(int n, int a, int b) {
		int tmp = Math.max(a, b);
		a = Math.min(a, b);
		b = tmp;
		int x = Math.abs(a - b);
		if (x == 0) {
			x = a;
		}
		for (int  i = a * (n - 1); i <= b * (n - 1); i += x) {
			System.out.print(i);
			System.out.print(" ");
		}
		
	}
	public static void main(String[] args)
	{
		ManasAndStones object = new ManasAndStones();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of stones");
		int n = sc.nextInt();
		System.out.println("Enter a value");
		int a = sc.nextInt();
		System.out.println("Enter b value");
		int b= sc.nextInt();
		object.calculateStones(n, a, b);
		
	}
}
