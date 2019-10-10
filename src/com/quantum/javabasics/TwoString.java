package com.quantum.javabasics;
import java.util.*;
public class TwoString {
	public static void main(String[] args)
	{
		System.out.println("Enter 1st string");
		Scanner sc=new Scanner (System.in);
		String first=sc.next();
		System.out.println("Enter 2nd String");
		String second=sc.next();
		int count=0;
		for(int i=0;i<first.length();i++) {
			for(int j=0;j<second.length();j++)
			{
				if(first.charAt(i)==second.charAt(j))
				{
					System.out.println("You can make sub string");
					count++;
				}
			}
		}if(count==0)
		{
			System.out.println("Sorry not possible ");
		}
	}
}
