package com.quantum.javabasics;

import java.util.Scanner;

public class RotationOfString {
	
	public boolean isRotation(String s)
	{
		String s1="";
		for(int i=s.length()-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);
		}
		if(s.equals(s1)) {
			
			return true;
		}
		else
			{
			
			  return false;
		    }
	}
	public void display(String s2)
	{
		if(isRotation(s2))
		{
			System.out.println("Rotation is possible");
		}
		else
		{
			System.out.println("Rotation is not possible");
		}
	}
	public static void main (String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		RotationOfString rs=new RotationOfString();
		System.out.println("Enter the String you want to check");
		String s2=sc.next();
		rs.display(s2);
		Thread.sleep(5000);
		System.out.println();
		System.out.println("Do You Have More To Check?");
		String s3=sc.next();
		if(s3.equals("yes"))
		{
			System.out.println("Enter the string");
			String s4=sc.next();
			rs.display(s4);
		}
		else
		{
			System.out.println("Thank You");
		}
		
		
	}
}
