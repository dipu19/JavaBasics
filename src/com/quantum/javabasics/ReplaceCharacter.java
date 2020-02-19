package com.quantum.javabasics;

import java.util.Scanner;

public class ReplaceCharacter {

	public void replace(String str)
	{
		char[] arr=new char[str.length()];
		for(int i=0;i<str.length();i++)
		{
			arr[i]=str.charAt(i);
			int ascii=(int)str.charAt(i);
			int ascii1=0;
			if(ascii>=65&ascii<=90)
			{
				ascii1=ascii+32;
			}
			if(ascii>=97&ascii<=122)
			{
				ascii1=ascii-32;
			}
			arr[i]=(char)ascii1;
		}
		
		for(int i=0;i<str.length();i++)
		{
			System.out.print(arr[i]);
		}
		
	}
	public static void main(String[] args)
	{
		ReplaceCharacter rc=new ReplaceCharacter();
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String string=sc.next();
		rc.replace(string);
	}
}
