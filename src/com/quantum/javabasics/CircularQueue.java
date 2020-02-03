package com.quantum.javabasics;

import java.util.HashSet;

public class CircularQueue {
 public static void main (String[] args)
 {
	 int count=0;
	 HashSet <Integer>se1=new HashSet();
	 HashSet<Integer>cse2=new HashSet();
	 se1.add(12);
	 se1.add(13);
	 cse2.add(13);
	 cse2.add(12);
	 if(se1==cse2)
	 {
		 count++;
	 }
	 System.out.println(count);
 }
		  
}
