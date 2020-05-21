package com.quantum.javabasics;

import java.util.HashMap;
import java.util.Map;

public class NumberOfVowelsInAString {

	public void countVowel(String string)
	{
		int result = 0;
		
		char[] charArray = new char[5];
		charArray[0] = 'a';
		charArray[1] = 'e';
		charArray[2] = 'i';
		charArray[3] = 'o';
		charArray[4] = 'u';
		for(int i=0;i<string.length();i++)
		{
			for(int j=0;j<5;j++)
			{
				if(string.charAt(i) == charArray[j])
				{
					result++;
				}
			}
		}
		System.out.println("Total number of vowel "+result);
	
		
	}
	public static void main(String[] args)
	{
		NumberOfVowelsInAString object = new NumberOfVowelsInAString();
		String string = "Pinky is a good girl";
		object.countVowel(string);
	}
}
