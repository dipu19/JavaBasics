package com.quantum.javabasics;

import java.util.LinkedHashMap;

public class FindLongestSubStringWithoutRepeatingCharacter {
	
	public void longestSubString(String string) throws InterruptedException
	{
		char[] characterArray = string.toCharArray();
		
		LinkedHashMap <Character, Integer>charMap = new LinkedHashMap<Character, Integer>();
		
		String longestSubString = "";
		
		int longestSubStringLength = longestSubString.length();
		
		for(int i=0;i<characterArray.length;i++)
		{
			if(!charMap.containsKey(characterArray[i]))
			{
				charMap.put(characterArray[i], i);
			}
			
			else
			{
				i = charMap.get(characterArray[i]);
				charMap.clear();
			}
			
			if(charMap.size()>longestSubStringLength)
			{
				longestSubString = charMap.keySet().toString();
			}
			
		}
		
		System.out.println("Input string :" + string);
		Thread.sleep(1000);
		System.out.println("Longest sub string "+longestSubString);
		
		
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		FindLongestSubStringWithoutRepeatingCharacter object = new FindLongestSubStringWithoutRepeatingCharacter();
		
		String input = "javaconceptoftheday";
		
		object.longestSubString(input);
	}

}
