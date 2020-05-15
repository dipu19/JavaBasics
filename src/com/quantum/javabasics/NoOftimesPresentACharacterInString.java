package com.quantum.javabasics;

import java.util.HashMap;
import java.util.Map;

public class NoOftimesPresentACharacterInString {

	public void noOfTimes(String str)

	{
		String[] arr = str.split(" ");
		String str1 = "";
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 65; i < 91; i++) {
			char ch = (char) i;
			map.put(ch, 0);
		}
		for (int i = 97; i < 123; i++) {
			char ch = (char) i;
			map.put(ch, 0);
		}

		for (int i = 0; i < arr.length; i++) {
			str1 = str1 + arr[i];
		}
		int length = str1.length();
		
		for(int i=0;i<length;i++)
		{
			map.put(str1.charAt(i), map.get(str1.charAt(i))+1);
		}
		for(int i=0;i<length;i++)
		{  
			if(map.get(str1.charAt(i)) == 1)
	        {
				System.out.println(str1.charAt(i) +" is present "+map.get(str1.charAt(i))+" time");
		    }
			else
			{
		     	System.out.println(str1.charAt(i) +" is present "+map.get(str1.charAt(i))+" times");
			}
		}
		 
	}

	public static void main(String[] args) {
		NoOftimesPresentACharacterInString obj = new NoOftimesPresentACharacterInString();
		String str = "Java World";
		obj.noOfTimes(str);
	}
}
