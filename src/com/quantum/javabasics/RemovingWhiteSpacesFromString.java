package com.quantum.javabasics;

public class RemovingWhiteSpacesFromString {

	public void remove(String string)
	{
		String[] stringArray = string.split(" ");
		
		string = "";
		for(int i= 0;i<stringArray.length;i++ )
		{
			string = string+stringArray[i];
		}
		
		System.out.println(string);
	}
	
	public static void main(String[] args)
	{
		String string = "Dipu is a good boy";
		
		RemovingWhiteSpacesFromString object = new RemovingWhiteSpacesFromString();
		
		object.remove(string);
	}
}
