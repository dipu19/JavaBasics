package com.quantum.javabasics;

public class PalindromicPractice {

	public boolean checkPalindrome(String s)
	{
		int length = s.length();
		for(int i=0,j=length-1; i<length&j>=0;i++,j--)
		{
			if(s.charAt(i) != s.charAt(j))
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args)
	{
		PalindromicPractice object = new PalindromicPractice();
		
	}
}
