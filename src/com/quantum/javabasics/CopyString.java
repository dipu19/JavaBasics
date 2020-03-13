package com.quantum.javabasics;

public class CopyString {

	//number of ways we copy a string.
	
	
	//All these methods are without creating object in heap memory.
	
	//using while loop.
	public void method1(String string)
	{
		String s2 = "";
		int count = 0;
		int length = string.length();
		while(count != length)
		{
			s2 = s2 +string.charAt(count);
			count++;
		}
		System.out.println(s2);
	}
	
	//using string reference.
	public void method2(String string)
	{
		String s2 = string;
		System.out.println(s2);
	}
	
	//using for loop.
	public void method3(String string)
	{
		String s2 = "";
		for(int i = 0;i < string.length();i++)
		{
			s2 = s2+string.charAt(i);
		}
		System.out.println(s2);
	}
	
	//It will create object in heap memory.
	//using new key word.
	public void method4(String string)
	{
		String s2 = new String();
		s2 = string;
		System.out.println(s2);
	}
	
	public static void main(String[] args)
	{
		CopyString copyObject =new CopyString();
		copyObject.method1("dipu is a good boy");
	}
}
