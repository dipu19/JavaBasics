package com.quantum.javabasics;
import java.util.*;
public class SherlockAndValidString {
	public static void main(String[] args)
	{
		System.out.println("Enter a String");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		Set<Character>hs=new HashSet<Character>(s.length());
		for(int i=0;i<s.length();i++)
		{
			hs.add(s.charAt(i));
		}if(s.length()==hs.size()||s.length()==hs.size()+1)
		{
			System.out.println("Valid String");
			
		}else
		{
			System.out.println("Not a valid String");
		}
	}
			
}
