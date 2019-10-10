package com.quantum.javabasics;
import java.util.*;
public class TheLoveLetterMystery {
	public static void main(String[] args)
	{
		System.out.println("Enter String");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String s1=s;
		int count=0;
		  
	       
	        int i = 0, j = s.length() - 1;
	        while(i < j){
	            count += Math.abs(s.charAt(i) - s.charAt(j));
	            i++; j--;
	        }
	        System.out.println(count);
	}
}
