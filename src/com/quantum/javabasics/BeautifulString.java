package com.quantum.javabasics;
import java.util.*;
public class BeautifulString {
	public static void main(String[] args)
	{
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String s1="010";
		 int step = 0;
		    for (int i = 0; i <= s.length() - 3;) {
		        if (s.substring(i, i + 3).equals("010")) {
		            step++;
		            i = i + 3;
		        } else {
		            i++;
		        }
		    }
		    System.out.println(step);
	}
}
