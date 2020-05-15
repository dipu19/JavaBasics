package com.quantum.javabasics;


import java.util.HashMap;
import java.util.Map;

public class UniqueCharactersInString {
	
	//Using map

	public void findUniqueCharacters(String string)
	{
		
		int length = string.length();
		
		Map <Character,Integer>map = new HashMap<Character,Integer>();
		for(int i = 96;i<123;i++)
		{
			Character ch = (char)i;  
			map.put(ch, 0);
		}
		
		for(int i=0 ;i<length;i++)
		{
			char ch= string.charAt(i);
			map.put(ch, map.get(ch)+1);
			
		}
		System.out.println("Unique characters are :");
		for(int i = 96;i<123;i++)
		{
			Character ch = (char)i;  
			if(map.get(ch) == 1)
			{
				System.out.print(ch+" ");
			}
		}
		
	
	}
	public static void main(String[] args)
	{
		UniqueCharactersInString obj = new UniqueCharactersInString();
		String str = "dipuerttd";
		obj.findUniqueCharacters(str);
		
	}
}
