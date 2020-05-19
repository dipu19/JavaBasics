package com.quantum.javabasics;

import java.util.ArrayList;

public class ReverseStringFromGeeksForGeeks {

	public void reverse(String string)
	{
		String[] stringArray = string.split(" ");
		
		int length = stringArray.length;
		
		ArrayList <String>reverseResultArray = new ArrayList<String>(); 
		
		String result = "";
		for(int i=0; i<length; i++)
		{
			String subString ="";
			
			for(int j=stringArray[i].length()-1; j>=0; j--)
			{
				subString = subString+stringArray[i].charAt(j);
			}
			
			reverseResultArray.add(subString);
			
		}
		
		for(int i=reverseResultArray.size()-1;i>=0;i--)
		{
			result = result+reverseResultArray.get(i)+" ";
		}
		
		
		
		System.out.println(result);
	}
	
	public static void main(String[] args)
	{
		ReverseStringFromGeeksForGeeks stringObject = new ReverseStringFromGeeksForGeeks();
		stringObject.reverse("Java Concept Of The Day");
	}
}
