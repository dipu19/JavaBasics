package com.quantum.javabasics;
import java.util.*;
public class CheckingSumIs15OrDifferenceIs15 {
	public boolean result(int number,int number1)
	{
		  int sum=Math.abs(number+number1);
		  int difference=Math.abs(number-number1);
		  if(sum==15)
		  {
			  return true;
		  }
		  else
		  {
			  return false;
		  }
		 
	}
	public boolean result1(int number,int number1)
	{
		int d1=Math.abs(number-number1);
		if(d1==15)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
  public static void main(String[] args)
  {
	  System.out.println("Enter the 1st number");
	  Scanner sc=new Scanner(System.in);
	  int number=sc.nextInt();
	  System.out.println("Enter the 2nd number");
	  int number1=sc.nextInt();
	  int sum=Math.abs(number+number1);
	  int difference=Math.abs(number-number1);
	  CheckingSumIs15OrDifferenceIs15 d2=new CheckingSumIs15OrDifferenceIs15();
	  System.out.println("sum is "+d2.result(number, number1));
	  System.out.println("but difference is "+d2.result1(number, number1));
  }
}
