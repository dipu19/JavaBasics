package com.quantum.javabasics;

public class CheckStringIsPalindromeOrNot {

	public static void main(String[] args) {
		String input = "test";
		int count=0 ;
		int b = input.length() - 1;
		for(int i = 0; i < input.length()/2; i++ )
		{
			if(input.charAt(i) == input.charAt(b) )
			{
				b--;
				count =count+1;
			}	
			
		}
		if(count == input.length()/2)
		{
			System.out.println("pallindrome");
		}
		else
		{
			System.out.println("not a pallindrome");
		}
		
	}

}
