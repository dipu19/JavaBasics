package com.quantum.javabasics;
import java.util.*;
public class Anagram {
	
	public void anagram(String s1,String s2)
	{
		String res="not anagram";
		int count=0;
		char[] al1 =new char[s1.length()];
		char[] al2 =new char[s2.length()];
		if(s1.length()!=s2.length())
		{
			System.out.println("Not anagram");
		}
		else
		{
		for(int i=0;i<s1.length();i++)
		{
			al1[i]=s1.charAt(i);
			al2[i]=s2.charAt(i);
			} /*
				 * System.out.println(al1); System.out.println(al2);
				 */
		Arrays.sort(al1);
		Arrays.sort(al2);
			
		for(int i=0;i<al1.length;i++)
		{
			if(al1[i]==al2[i])
			{
				count++;
			}
		}
		if (count==al1.length)
		{
			System.out.println("anagram");
		}
		else
		{
			System.out.println("not anagram");
		}
		}
		
		
		
	}
	public static void main(String[] args) {
		Anagram ag=new Anagram();
     ag.anagram("paap", "appaa");
	}
}

