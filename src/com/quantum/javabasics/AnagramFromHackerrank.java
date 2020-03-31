package com.quantum.javabasics;

import java.util.Scanner;

public class AnagramFromHackerrank {

	public  void checkAnagram(String s)
	{
		int result =0;
		if (s.length()%2 == 0)
		{
			for(int i=0;i<s.length()/2;i++)
			{
				int count =0;
				for(int j=s.length()-1;j>=s.length()/2;j--)
				
				{
					if(s.charAt(i)!=s.charAt(j))
					{
						count++;
					}
				}
				if(count == s.length()/2 )
				{
					result++;
				}
			}System.out.println(result+" no of changes ");
		}
		else
		{
			System.out.println(s+" is not anagram");
		}
	}
	public static void main(String[] args)
	{
		AnagramFromHackerrank object = new AnagramFromHackerrank();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String string = sc.next();
		object.checkAnagram(string);
	}
}
