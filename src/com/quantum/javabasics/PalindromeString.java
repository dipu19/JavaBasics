package com.quantum.javabasics;

public class PalindromeString {

	public String string(String s)
	{
		int length=s.length();
		int count=0;
		String s1=" lk";
		for(int i=0,j=s.length()-1;i<length&j>0;i++,j--)
		{
			if(s.charAt(i)==s.charAt(j))
			{
				count++;
			}
		}
		if (count==s.length()-1)
		{
			s1="String is palindrome";
		}
		else
		{
			s1="String is not palindrome";
		}
		return s1;
	}
	public static void main (String[] args)
	{
		PalindromeString ps= new PalindromeString( );
		System.out.print(ps.string("patap"));
	}
}
