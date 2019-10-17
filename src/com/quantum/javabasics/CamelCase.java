package com.quantum.javabasics;
import java.util.*;
public class CamelCase {
	public static void main(String[] args)
	{
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int count=1;
		for(int i=0;i<s.length();i++)
		{
			for(int j=65;j<92;j++)
			{
				if(s.charAt(i)==(char)j)
				{
					count++;
				}
			}
		}System.out.println(count);
	}
}
