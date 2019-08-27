package com.quantum.javabasics;

import java.util.Scanner;

public class SumOfDigit {
	 public static void main(String[] args)
	   {
			 System.out.println("Enter the digit");
			 Scanner s=new Scanner(System.in);
			 int m=s.nextInt();
		    int n=0; int sum = 0;
	         while(m > 0)
	          {
	            n = m % 10;
	            sum = sum + n;
	            m = m / 10;
	   }
	       System.out.println("Sum of Digits:"+sum);
	}   

}
