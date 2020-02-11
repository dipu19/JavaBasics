package com.quantum.javabasics;

import java.util.ArrayList;
import java.util.Scanner;

public class Occurence {

	public void occournce(String s )
	{
		ArrayList<Character> al=new ArrayList<Character>();
		for(int i=0;i<s.length();i++)
		{
			al.add(s.charAt(i));
		}
		for(int i=0;i<al.size();i++)
		{
			int count=1;
			for(int j=i+1;j<al.size();j++)
			{
				if(al.get(i)==al.get(j))
				{
					count++;
					al.remove(j);
				}
			}System.out.println(s.charAt(i)+" presnt "+count+" times");
		}
	}
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=sc.next();
		Occurence oc=new Occurence();
		oc.occournce(s1);
	}
}
