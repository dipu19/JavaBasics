package com.quantum.javabasics;

import java.util.Scanner;

public class ReverseANumber {
	public static void main(String[] args) {
		int s,sum=0,r;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number :");
		s=sc.nextInt();
		
		
		while(s>0) {
			r=s%10;
			sum=sum*10+r;
	        s=s/10;
			
			
		}
System.out.println("reverse:"+sum);
}
}
