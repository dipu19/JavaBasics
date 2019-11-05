package com.quantum.javabasics;
import java.util.*;
public class CasearCipher {
 public static void main(String[] args)
 {
	 System.out.println("Enter the string");
	 Scanner sc=new Scanner(System.in);
	 String input=sc.next();
	 ArrayList <Character>ar=new ArrayList<Character>(input.length());
	 ArrayList <Character>br=new ArrayList<Character>(input.length());
	 for(int i=0;i<input.length();i++)
	 {
		 ar.add(input.charAt(i));
	 }
	 for(int i=0;i<ar.size();i++)
	 {
		 for(int j=65,k=97;j<=90&k<=122;j++,k++)
		 {
			 if(ar.get(i)==(char)j||ar.get(i)==(char)k)
			 {
				 char ch=(char)((int)ar.get(i)+3);
				 br.add(ch);
			 }
			
		 }for(int l=33;l<=47;l++)
		 {
			 if(ar.get(i)==(char)l)
			 {
				 br.add((char)l);
			 }
		 }
	 }System.out.println(br);
	 String result="";
	 
	 for(int i=br.size()-1;i>=0;i--)
	 {
		 result=br.get(i)+""+result;
	 }System.out.println(result);
 }
}
