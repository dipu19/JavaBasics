package com.quantum.javabasics;

import java.util.StringTokenizer;

public class StringTokenization {

	public static void main(String[] args)
	{
		String str = "Hello.i.am Dipu";
		StringTokenizer stringToken = new StringTokenizer(str, ".");
		System.out.println(stringToken.countTokens());
		while(stringToken.hasMoreTokens())
		{
			System.out.println(stringToken.nextToken());
		}
		
	}
}
