package com.quantum.javabasics;
import java.util.*;
public class AlternatingCharacter {
	public static void main(String[] args)
	{
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int count=0;
		ArrayList <Character>arr=new ArrayList<Character>();
		
		  for(int i=0;i<s.length()-1;i++) { for(int j=i+1;j<s.length();j++)
		  if(s.charAt(i)==s.charAt(j)) { count++; arr.add(s.charAt(j)); }
		  
		  else { if(s.charAt(i)!=s.charAt(j)) { 
			  i=j;	  
		  } }
		  
		  
		  }System.out.println(count); System.out.println(arr);
		 
  
	}
}
