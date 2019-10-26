package com.quantum.javabasics;
import java.time.LocalTime;
import java.util.*;
public class TheTime {
   public static void main(String[] args)
   {
	   System.out.println("Enter hour ");
	   Scanner sc=new Scanner(System.in);
	   int  hr=sc.nextInt();
	   System.out.println("Enter miniute");
	   int min=sc.nextInt();
	   ArrayList<String> al=new ArrayList<String>();
	   al.add("zero");
	   al.add("one");
	   al.add("two");
	   al.add("three");
	   al.add("four");
	   al.add("five");
	   al.add("six");
	   al.add("seven");
	   al.add("eight");
	   al.add("nine");
	   al.add("ten");
	   al.add("eleven");
	   al.add("tweleve");
	   al.add("thirteen");
	   al.add("fourteen");
	   al.add("fifteen");
	   al.add("sixteen");
	   al.add("seventeen");
	   al.add("eighteen");
	   al.add("nineteen");
	   al.add("twenty");
	   al.add("twenty one");
	   al.add("twenty two");
	   al.add("twenty three");
	   al.add("twenty four");
	   al.add("twenty five");
	   al.add("twenty six");
	   al.add("twenty seven");
	   al.add("twenty eight");
	   al.add("twenty nine");
	   al.add("thirty");
	   
	   if(min==0)
	   {
		   System.out.println(al.get(hr)+" o' clock");
	   }
	   if(min>=1&&min<=30)
	   {
		   if(min==1)
		   {
			   System.out.println(al.get(min)+" minute past "+al.get(hr));
		   }
		   else 
			   if(min==15)
		   {
			   System.out.println("quarter past "+al.get(hr));
		   }
		   else 
		     {
		      System.out.println(al.get(min)+" minutes past "+al.get(hr));
	         }
		   }
		   if(min>30&&min<60)
		   {
			   if(min==45)
			   {
				   System.out.println("quarter to "+al.get(hr+1));
			   }
			   else {
				   System.out.println(al.get(60-min)+" minutes to "+al.get(hr+1));
			   }
		   }
	   
	   
			   
   }
}
