package com.quantum.javabasics;
import java.util.*;
public class EncryptedString {
   
	  public static void main(String[] args)
	  {
		 System.out.println("Enter a string");
		  Scanner sc=new Scanner(System.in);
		  String s=sc.nextLine();
		  
		  ArrayList <Character>al=new ArrayList<Character>(s.length());
		  for(int i=0;i<s.length();i++)
		  {
			  if(s.charAt(i)!=' ')
			 al.add(s.charAt(i)); 
		  }int sqrt=(int)Math.sqrt(al.size());
		  int pround=(int)Math.abs(sqrt);
		 
		  for(int i=0;i<al.size();i++)
		  {
			 System.out.print(al.get(i));  
			 if(i==pround)
			 {
				 System.out.print("\n");
				 i=pround;
				 pround=i+(pround+1);
				 
				 
			 }
			  
		  }
		  }
		 
		 
	  }

