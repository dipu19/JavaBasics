package com.quantum.javabasics;

import java.util.Date;
import java.util.Scanner;

public class GetDateAndTime {
	public static void main(String [] args)
	{
		Date d1=new Date();
		System.out.println(d1.getDate()+"/"+ (d1.getMonth()+1)+"/"+(d1.getYear()-100));
		System.out.println("If You Want To Know The Time Then Press 1");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	
		if(n==1)
		{
			System.out.println("Thank You For Your Interest");
		System.out.println("The Time Is "+d1.getHours()+"."+d1.getMinutes()+"."+d1.getSeconds());
		}	
		}
}
