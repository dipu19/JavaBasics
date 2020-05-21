package com.quantum.javabasics;

public class ConvertUpperCaseTolowerCase {

	public void convert(String string)
	{
		char[] charArray = string.toCharArray();
		for(int i=0;i<charArray.length;i++)
		{
			if(charArray[i]>=65 & charArray[i]<=90)
			{
				int asciiOfUpperCaseCharacter = (int)charArray[i] ;
				
				int asciiOfLowerCaseCharacter = asciiOfUpperCaseCharacter+32;
				
				char lowerCaseCharacter = (char) asciiOfLowerCaseCharacter;
				
				charArray[i] = lowerCaseCharacter;
			}
		}
		
		string = "";
		
		for(int i=0;i<charArray.length;i++)
		{
			string = string+charArray[i];
		}
		
		System.out.println("Result string is "+string);
	}
	
	public static void main(String[] args)
	{
		ConvertUpperCaseTolowerCase object = new ConvertUpperCaseTolowerCase();
		
		String string  = "I Am Not A Good Boy";
		
		object.convert(string);
	}
}
