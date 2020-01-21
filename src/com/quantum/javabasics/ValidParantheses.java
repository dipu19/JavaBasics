package com.quantum.javabasics;

import java.util.Scanner;
import java.util.Stack;

public class ValidParantheses {
	
	public boolean valid(String x)
	{
		Stack <Character>s1=new Stack<Character>();
		for(int i=0;i<x.length();i++)
		{
			if(x.charAt(i)=='['||x.charAt(i)=='{'||x.charAt(i)=='(')
			{
				s1.push(x.charAt(i));
			}
			if(x.charAt(i)==']')
			{
				if(s1.isEmpty()||s1.pop()!='[')
				{
					return false;
				}
			}
			if(x.charAt(i)==')')
			{
				if(s1.isEmpty()||s1.pop()!='(')
				{
					return false;
				}
			}
			if(x.charAt(i)=='}')
			{
				if(s1.isEmpty()||s1.pop()!='{')
				{
					return false;
				}
			}
		}return s1.empty();
	}
	public static void main(String[] args)
	{
		ValidParantheses aw=new ValidParantheses();
		System.out.println(aw.valid("{(xxxyyy}"));
	}
}
