package com.quantum.javabasics;

public class ReverseAString {
	
	public static void main(String[] arg)
	{
		String s1="Dipu";
		String s2="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			System.out.print(s1.charAt(i));
			//System.out.println(i);
		}
		
	}
}
