package com.quantum.javabasics;
import java.util.*;
public class CommonChild {
 public static void main(String[] args)
 {
	 System.out.println("Enter 1st string");
	 Scanner sc=new Scanner(System.in);
	 String s1=sc.next();
	 System.out.println("Enter 2nd string");
	 String s2=sc.next();
		
	 int count=0;
	 int count1=0;
	 for(int i=0;i<s1.length();i++)
	 {
		 for(int j=0;j<s2.length();j++)
		 {
			 if(s1.charAt(i)==s2.charAt(j))
			 {
				 count++;
			 }
		 }
	 }if(count==s1.length()&count==s2.length())
	 {
		 for(int i=0,j=0;i<s1.length()&j<s2.length();i++,j++)
		 {
			 if(s1.charAt(i)==s2.charAt(j))
			 {
				 count1++;
			 }
		 }
		 if(count==count1)
		 {
			 System.out.println("length is "+count);
		 }
		 else
		 {
			 System.out.println("length is "+(count-1));
		 }
	 }
	 else
	 {
		 System.out.println("length is "+count);
	 }
 }
}
