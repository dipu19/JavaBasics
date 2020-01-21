package com.quantum.javabasics;

import java.util.ArrayList;
import java.util.Collections;

class SortingObject implements Comparable<SortingObject> {

	int age;
	int rollNo;
	String name;
	SortingObject(int age,int rollNo,String name)
	{
		this.age=age;
		this.rollNo=rollNo;
		this.name=name;
	}
	
	public int compareTo(SortingObject st) {
		if(age<st.age)
		{
			return -1;
		}
		else if(age>st.age)
		{
			return 1;
		}
		
			return 0;
		
	}
	
 }
	public class SortingUsingComparable
	{
        
         public static void main(String[] args)
         {
        	  ArrayList <SortingObject> al=new ArrayList<SortingObject>();
        	 al.add(new SortingObject(22,152,"Dipu"));
        	 al.add(new SortingObject(20,153,"Sipu"));
        	 al.add(new SortingObject(18,150,"Tipu"));
        	 Collections.sort(al);
        	 for(SortingObject st:al){  
        		 System.out.println(st.rollNo+" "+st.name+" "+st.age);  
        		 }
         }
	}
	

