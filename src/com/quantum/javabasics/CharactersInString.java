package com.quantum.javabasics;

import java.util.Scanner;

public class CharactersInString {
	 public static void main(String[] args)
	  {
		  System.out.println("Enter a string");
		  Scanner sc=new Scanner(System.in);
		  String s1=sc.next();
		  for(int i=0;i<s1.length();i++)
		  {
			  System.out.println("letter "+(i+1)+" is"+s1.charAt(i));
		  }
	  }
}
