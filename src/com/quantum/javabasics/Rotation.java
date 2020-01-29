package com.quantum.javabasics;

import java.util.Scanner;

public class Rotation {

	public boolean wantMore(String s)
	{
		if(s.equals("yes"))
		{
			return true;
		}
		return false;
	}
	public void check(String s1)
	{
		String s2="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
		}
		if(s2.equals(s1))
		{
			System.out.println("yes it is palindrome");
		}
		else {
		System.out.println("No it is not palindrome");
	}
	}
	public static void main(String[] args) throws InterruptedException
	{
		Scanner sc=new Scanner(System.in);
		
		String s5="yes";
		while(s5.equals("yes"))
		{
		System.out.println("Enter the string you want to check");
		String s1=sc.next();
		Rotation r=new Rotation();
		r.check(s1);
		Thread.sleep(1500);
		System.out.println("you want to check more ?");
		s5=sc.next();
		
		}
		System.out.println("Thank You");
	}
}
