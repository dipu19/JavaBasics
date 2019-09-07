package com.quantum.javabasics;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PrintDifferentCharacterFromString {
	public static void main(String[] args)
	{
      System.out.println("Enter the string");
      Scanner sc=new Scanner(System.in);
      String s1=sc.next();
      Set <Character>s2=new HashSet<Character>();
      for(int i=0;i<s1.length();i++)
      {
    	  s2.add(s1.charAt(i));
      }
      System.out.println(s2);
}
}
