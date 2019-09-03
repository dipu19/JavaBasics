package com.quantum.javabasics;

public class MarsProblem {
	public static void main(String[] args)
	  {
		  String s="SOSSTSSOS";
		  String s1="SOS";
		  int count = 0;
	      for (int i = 0; i < s.length(); i++) {
	          if (s.charAt(i) != s1.charAt(i % 3)) count++;
	      }System.out.println(count);

		
	  }
}
