package com.quantum.javabasics;

public class MethodsOfString {

	//String Concat method
	public String concat()
	{
		String string1 = "Dipu ";
		String string2 = "is a good boy";
		String result = string1+string2;
		return result;
	}
	
	//String replace method.
	public void replace()
	{
		String str = "Dipu";
		String str1 = str.replace('D', 'S');
		System.out.println(str1);
	}
	
	//Formatted String.
	public void formatString()
	{
		String name = "Dipu";
		String str  = String.format("my name is %s", name);
		System.out.println(str);
	}
	
	//SubString of a string
	//this method will give you sub string of a string.
	public void subString()
	{
		String str = "Dipu is a good boy";
		String substr = str.substring(3);
		System.out.println(substr);
		String substr1 = str.substring(3, 7);
		System.out.println(substr1);
	}
	
	public void contains()
	{
		String text = "I am a good boy";
		System.out.println(text.contains("g"));
	}
	
	public void join()
	{
		
		String str1 = String.join("java","is","a","programing language");
		System.out.println(str1);
	}
	public void lastIndexOf()
	{
		String str = "This is the last index of example";
		System.out.println(str.lastIndexOf("of",23));
		
	}
	
	public void splitmethod()
	{
		String str = "This is my first code";
		String[] array = str.split("s",5);
		for(String s:array)
		{
			System.out.println(s);
		}
	}
	
	public void startWith()
	{
		String str = "Dipu is a bad boy";
		System.out.println(str.startsWith("p",2));
	}
	
	public void charArray()
	{
		String s= "Dipu123";
		char[] arr=s.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
			
	public static void main(String[] args)
	{
		MethodsOfString object =new MethodsOfString();
		//System.out.println(object.concat());
		//object.startWith();
		object.charArray();
	}
	
	
}
