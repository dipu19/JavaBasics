package com.quantum.javabasics;

import java.util.HashMap;

public class PanagrmChecking {

	//Pangram checking method.
	public void checkPangram(String string)
	{
		if(string.length()>=26)
		{
		boolean[] arr = new boolean[26];
		int index=0;
		for(int i=0;i<string.length();i++)
		{
			if('A'<=string.charAt(i)&& 'Z'>=string.charAt(i))
			{
				index = string.charAt(i)-'A';
				
			}
			else if('a'<=string.charAt(i) && 'z'>=string.charAt(i))
			{
				index = string.charAt(i)-'a';
				
			}
				arr[index] = true;
		}
		int count = 0;
		for(int i=0;i<26;i++)
		{
			if(arr[i] == true)
			{
				count++;
			}
		}
		if(count == 26)
		{
			System.out.println("String is panagram");
		}
		else
		{
			System.out.println("String is not panagram");
		}
		}
	}
	public static void main(String[] args)
	{
		PanagrmChecking  object = new PanagrmChecking ();
		object.checkPangram("The quick brown fox jumps over the lazy dog");
	}
	
}
