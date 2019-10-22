package com.quantum.javabasics;
import java.util.*;
public class ChildString {
 public static void main(String[] args)
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter 1st String");
	 String s1=sc.next();
	 System.out.println("Enter 2nd String");
	 String s2=sc.next();
	 ArrayList <Character>al1=new ArrayList<Character>();
	 ArrayList <Character>al2=new ArrayList<Character>();
	 for(int i=0;i<s1.length();i++)
	 {int count=0;
		 for(int j=i+1;j<s1.length();j++)
		 {
			 if(s1.charAt(i)!=s1.charAt(j))
				 count++;
		 }if(count==s1.length()-(i+1))
		 {
			 al1.add(s1.charAt(i));
		 }
	 }System.out.println(al1);
	 int count2=0;
	 for(int i=0;i<s2.length();i++)
		 
	 {int count=0;
		 for(int j=i+1;j<s2.length();j++)
		 {
			 if(s2.charAt(i)!=s2.charAt(j))
				 count++;
		 }if(count==s2.length()-(i+1))
		 {
			 al2.add(s2.charAt(i));
		 }
	 }System.out.println(al2);
	 for(int i=0;i<al1.size();i++)
	 {
		 for(int j=0;j<al2.size();j++)
		 {
			 if(al1.get(i)==al2.get(j))
			 {
				 count2++;
			 }
		 }
	 }
	 //System.out.println(count2);
	 if(count2==s1.length()&count2==s2.length())
	 {int count=0;
		 for(int i=0,j=0;i<s1.length()&j<s2.length();i++,j++)
		 {
			 if(s1.charAt(i)==s2.charAt(j))
			 {
				 count++;
			 }
		 }if(count==s1.length())
		 System.out.println(count);
		 else
		 {
			 System.out.println(s1.length()-1);
		 }
	 }
	 else
	 {int count=0;
		 for(int i=0;i<al1.size();i++)
		 {
			 for(int j=0;j<al2.size();j++)
			 {
				 if(al1.get(i)==al2.get(j))
				 {
					count++; 
				 }
			 }
		 }System.out.println("length is "+count);
	 }
 }
}
