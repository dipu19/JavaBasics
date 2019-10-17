package com.quantum.javabasics;
import java.util.*;
public class SuperReducingString {
	public static void main(String[] args)
	{
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		ArrayList <Character>ar=new ArrayList<Character>(s.length()); 
		 for (int i = 1; i < s.length(); i++) {
	            if (s.charAt(i) == s.charAt(i-1)) {
	                s = s.substring(0, i-1) + s.substring(i+1);
	                i = 0;
	            }
	        }
	        if (s.length() == 0) {
	            System.out.println("Empty String");
	        } else {
	            System.out.println (s);
	        }
		
	}
}
