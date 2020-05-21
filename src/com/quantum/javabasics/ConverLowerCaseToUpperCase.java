package com.quantum.javabasics;

public class ConverLowerCaseToUpperCase {

	public void upperCase(String string)
	{
		char[] charArray = string.toCharArray();
		
		int arraylength = charArray.length;
		
		for(int i=0;i<arraylength;i++)
		{
			if(charArray[i] >=97 &charArray[i]<= 122)
			{
				int asciiOfLowerCaseCharacter = (int)charArray[i];
				
				char upperCaseCharacter = (char)(asciiOfLowerCaseCharacter - 32);
				
				charArray[i] = upperCaseCharacter;
			}
		}
		
		string = "";
		
		for(int i=0;i<arraylength;i++)
		{
			string = string+charArray[i];
		}
		
		System.out.println("The result string is "+string);
		
	}
	
	public static void main(String[] args)
	{
		ConverLowerCaseToUpperCase object = new ConverLowerCaseToUpperCase();
		
		String string = "I am a good boy";
		
		object.upperCase(string);
	}
}
