package com.quantum.javabasics;

import java.util.Scanner;

public class PercentageCalcultaorOfStudent {
	public static void main(String[] args)
	{
	System.out.println("Enter Student Name");
	Scanner sc=new Scanner(System.in);
	String name=sc.next();
	System.out.println("Enter the Marks In Physics");
	double phy=sc.nextDouble();
	System.out.println("Enter The Marks In Math");
	double math=sc.nextDouble();
	System.out.println("Enter The Marks In English");
	double eng=sc.nextDouble();
	System.out.println("Welcome "+name);
	System.out.println("Press 1 If You Want To Know Total Marks");
	System.out.println("Press 2 If You Want To Know Percentage");
	System.out.println("Press 3 If You Want To Know Total Marks & Percentage");
	int choice=sc.nextInt();
	if(choice==1)
	{
		System.out.println("Your Total Mark Is "+(phy+math+eng));
	}
	else if(choice==2)
	{
		double perc=((phy+math+eng)/300)*100;
		System.out.println("Your Percentage Is "+perc);
		
	}
	if(choice==3)
	{
		double perc=((phy+math+eng)/300)*100;
		double total=phy+math+eng;
		System.out.println("Your Mark Is "+total+"Your Percentage Is"+perc);
	}
	else if(choice>3&choice<1)
	{
		System.out.println("Please Select Option From 1 to 3");
		
	}
	{
		
	}
	}
}
