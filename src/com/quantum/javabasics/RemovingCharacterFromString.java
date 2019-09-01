package com.quantum.javabasics;
import java.util.*;
public class RemovingCharacterFromString {
	 public static void main(String[] args)
	   {
		   String s="abaacdabd";
		   String s1="";
		   
		   char common=' ';
		   ArrayList<Character> chars = new ArrayList<Character>();
		   for(int i=0,j=1;i<s.length()&j<s.length();i++,j++)
		   {
			   if(s.charAt(i)==s.charAt(j))
					   {
				         common=s.charAt(i);
					   }
		   }
		   s1=s.replace(common, ' ');
		   for(int i=0;i<s1.length();i++)
		   {
			   if(s1.charAt(i)!=' ')
			   {
				  chars.add(s1.charAt(i)); 
			   }
		   }for(int i=0;i<chars.size();i++)
		   {
			System.out.println(chars.get(i));
		   }
		   }
}
