package com.quantum.javabasics;
import java.util.*;
public class StringConstruction {
	public static void main(String[] args)
	{
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		Set<Character> al=new HashSet(s.length());
		for(int i=0;i<s.length();i++)
		{
			al.add(s.charAt(i));
		}
		System.out.println(al.size());
	}
}
