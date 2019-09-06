package com.quantum.javabasics;

import java.util.Scanner;

public class MiniCalculator {
	public static void main(String[] args)
	{
		double result=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st number.");
		int n1=sc.nextInt();
		System.out.println("Enter 2nd number.");
		int n2=sc.nextInt();
		System.out.println("Press 1 to add. ");
		System.out.println("Press 2 for multiplication. ");
		System.out.println("Press 3 for substraction. ");
		System.out.println("Press 4 for divison. ");
		System.out.println("Enter your choice to do. ");
		
		int choice=sc.nextInt();
		switch(choice)
		{
		case(1):
		     result=n1+n2;
	         break;
		case(2):
			result=n1*n2;
		    break;
		case(3):
			result=n1-n2;
		    break;
		case(4):
			result=n1/n2;
		break;
		}
		if(choice>0&choice<5)
		{
		System.out.println("Please check your result.");
		System.out.println(" your result is "+result);
		System.out.println("Thank you.");
		}
		else {
			System.out.println("Enter the right choice.");
			System.out.println("Thank you.");
		}
		}
}
